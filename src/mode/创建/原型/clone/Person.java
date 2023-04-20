package mode.创建.原型.clone;

/**
 * 原型模式--克隆方式(默认深拷贝)
 * 克隆方式：JVM调用clone方法来拷贝复制已有对象 比通过new创建方式要快
 * 通过实现Cloneable接口重写clone方法来实现，如果内部有引用类型也要实现Clonable接口，递归调用clone方法
 * 缺点：各个内层引用类都要实现Cloneable接口并且重写clone方法 递归调用会影响性能
 *
 * @author cac2020
 */
public class Person implements Cloneable{
    private String name;
    private int age;
    private Location loc;

    public Person(String name, int age, Location loc) {
        this.name = name;
        this.age = age;
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = (Person)super.clone();
        p.loc = (Location)loc.clone();
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
