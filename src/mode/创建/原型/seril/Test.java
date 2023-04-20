package mode.创建.原型.seril;

/**
 * 测试序列化方式创建原型
 *
 * @author cac2020
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("小明",10,new Location("100","200"));
        Person p2 = p1.myClone();
        System.out.println(p1 == p2);//false
        System.out.println(p1.getLoc() == p2.getLoc());//false
    }
}
