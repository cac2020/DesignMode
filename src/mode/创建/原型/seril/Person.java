package mode.创建.原型.seril;

import java.io.*;

/**
 * 原型模式--优点：原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
 * 原型模式通常适用于以下场景:
 * 1.对象之间相同或相似，即只是个别的几个属性不同的时候。
 * 2.创建对象成本较大，例如初始化时间长，占用CPU太多，或者占用网络资源太多等，需要优化资源。
 * 3.创建一个对象需要繁琐的数据准备或访问权限等，需要提高性能或者提高安全性。
 * 4.系统中大量使用该类对象，且各个调用者都需要给它的属性重新赋值。
 * 5.在 Spring中，原型模式应用的非常广泛，例如 scope=‘prototype’、JSON.parseObject() 等都是原型模式的具体应用。
 *
 * 序列化方式：
 * 如果引用类型里面还包含很多引用类型，或者内层引用类型的类里面又包含引用类型，使用 clone 方法就会很麻烦。
 * 此时可以用序列化的方式来实现对象的深克隆。各个内层类都要实现Serializable接口
 *
 * 相比较克隆方式：
 * 1.当前复制类及其内部引用类都要实现实现Serializable接口
 * 2.需要在当前类自定义一个序列化的方法
 * 3.不需要重写接口方法和递归调用
 *
 *
 * @author cac2020
 */
public class Person implements Serializable {

    private String name;
    private int age;
    private Location loc;

    public Person(String name, int age, Location loc) {
        this.name = name;
        this.age = age;
        this.loc = loc;
    }

    /**
     * 自定义序列化拷贝对象
     * @return
     */
    public Person myClone(){
        Person p = null;
        try {
            //将该对象序列化成流，因为写在流里的是对象的一个拷贝，而源对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            //写出当前对象
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            //读取当前对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            p = (Person)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }
}
