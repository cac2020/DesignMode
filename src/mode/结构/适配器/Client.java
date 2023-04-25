package mode.结构.适配器;

/**
 * 对象适配器模式与类适配器模式基本相同，二者的区别在于前者
 * 的Adaptee（被适配者）以接口形式出现并被Adapter（适配器）引
 * 用，而后者则以父类的角色出现并被Adapter（适配器）继承，所以前
 * 者更加灵活，后者则更为简便。
 */
public class Client {
    public static void main(String[] args) {
        /**对象适配器*/
        //构造两插电视机
        DualPin dualPinDevice = new TV();
        //适配器接驳两端
        TriplePin triplePin = new Adapter(dualPinDevice);
        //此处调用的是三插通电标准
        triplePin.electrify(1,0,-1);
        //火线通电：1，零线通电：0电视开机

        /**类适配器*/
        TriplePin triplePin1 = new TVAdapter();
        triplePin1.electrify(1,0,-1);
    }
}
