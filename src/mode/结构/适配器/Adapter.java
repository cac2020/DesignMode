package mode.结构.适配器;
/**
 * 解决兼容性问题
 * 适配器模式（Adapter）通常也被称为转换器，顾名思义，它一定
 * 是进行适应与匹配工作的物件。当一个对象或类的接口不能匹配用户
 * 所期待的接口时，适配器就充当中间转换的角色，以达到兼容用户接
 * 口的目的，同时适配器也实现了客户端与接口的解耦，提高了组件的
 * 可复用性。
 *
 * 生活案例：翻译对于不同语言的人、转换器对于两相电源线插头和三相插座口等
 */

/**
 * 对象适配器 针对各种两相接口设备
 */
public class Adapter implements TriplePin {
    private DualPin dualPinDevice;

    /**
     * 创建适配器时，需要把两插设备接入进来
     * @param dualPinDevice
     */
    public Adapter(DualPin dualPinDevice){
        this.dualPinDevice = dualPinDevice;
    }

    /**
     * 适配器实现的是目标接口
     * @param l
     * @param n
     * @param e
     */
    @Override
    public void electrify(int l, int n, int e) {
        //调用被适配设备的两插通电方法，忽略地线参数e
        dualPinDevice.electrify(l,n);
    }
}
