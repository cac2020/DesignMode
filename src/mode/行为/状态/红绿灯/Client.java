package mode.行为.状态.红绿灯;
/**
 * 状态模式的应用将系统状态从系统环境（系统宿主）中彻
 * 底抽离出来，状态接口确立了高层统一规范，使状态响应机制分立、
 * 自治，以一种松耦合的方式实现了系统状态与行为的联动机制。如此
 * 一来，系统环境不再处理任何状态响应及切换逻辑，而是转发给当前
 * 状态对象去处理，同时将自身引用“this” 传递下去。也就是说，系
 * 统环境只需要持有当前状态，而不必再关心如何根据状态进行响应，
 * 或是如何进行状态更新了
 *
 * 从类结构上看，状态模式与策略模式非常类似，其不同之处在
 * 于，策略模式是将策略算法抽离出来并由外部注入，从而引发不同的
 * 系统行为，其可扩展性更好；而状态模式则将状态及其行为响应机制
 * 抽离出来，这能让系统状态与行为响应有更好的逻辑控制能力，并且
 * 实现系统状态主动式的自我转换
 *
 * 使用场景：
 * 如果系统中堆积着大量的状态判
 * 断语句，那么就可以考虑应用状态模式，它能让系统原本复杂的状态
 * 响应及维护逻辑变得异常简单。
 */
public class Client {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
        /**
         * OK...黄灯亮起5秒
         * OK...绿灯亮起60秒
         * OK...黄灯亮起5秒
         * OK...红灯亮起60秒
         */
    }
}
