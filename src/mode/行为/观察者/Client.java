package mode.行为.观察者;

/**
 * 察言观色、思考分析一直是人类认识客观事物的重要途径。观察
 * 行为通常是一种为了对目标状态变化做出及时响应而采取的监控及调
 * 查活动。观察者模式（Observer）可以针对被观察对象与观察者对象
 * 之间一对多的依赖关系建立起一种行为自动触发机制，当被观察对象
 * 状态发生变化时主动对外发起广播，以通知所有观察者做出响应。
 * 观察者往往眼观六路，耳听八方，随时监控着被观察对象的一举
 * 一动。作为主动方的观察者对象必须与被观察对象建立依赖关系，以
 * 获得其最新动态，例如记者与新闻、摄影师与景物、护士与病人、股
 * 民与股市等，以股民盯盘为例，
 *
 * 为了实现状态即时同步的目的，对象间就得建立
 * 合适的依赖关系与通告机制，而不是像股民那样，每个人都必须持续
 * 监控股市动态，除此之外不做其他任何事情，所以如何设计对象间的
 * 交互方式决定着软件运行效率的高低。
 *
 */
public class Client {
    public static void main(String[] args) {
        Buyer tangSir = new PhoneFans("手机粉");
        Buyer barJee = new HandChopper("剁手族");
        Shop shop = new Shop();

        //预订注册
        shop.register(tangSir);
        shop.register(barJee);

        //商品到货
        shop.setProduct("猪肉炖粉条");
        shop.setProduct("橘子手机");
    }
}
