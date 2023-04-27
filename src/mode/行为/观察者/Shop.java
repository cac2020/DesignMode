package mode.行为.观察者;

import java.util.ArrayList;
import java.util.List;

/**
 * 作为一种发布/订阅（publish/subscribe）式模型，观察者模式
 * 被大量应用于具有一对多关系对象结构的场景，它支持多个观察者订
 * 阅一个目标主题。一旦目标主题的状态发生变化，目标对象便主动进
 * 行广播，即刻对所有订阅者（观察者）发布全员消息通知
 *
 * 以“单方驱动全局”模式取代“多方持续轮询”模式，使目标主题（单方）的任何状态更新都能被
 * 即刻通过广播的形式通知观察者们（多方），解决了状态同步知悉的效率问题。
 */
public class Shop {
    private String product;
    private List<Buyer> buyers;// 预订清单

    public Shop() {
        this.product = "无商品";
        this.buyers = new ArrayList<>();
    }

    // 注册买家到预订清单中
    public void register(Buyer buyer) {
        this.buyers.add(buyer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;// 到货了
        notifyBuyers();// 到货后通知买家
    }

    // 通知所有注册买家
    public void notifyBuyers() {
        buyers.stream().forEach(b -> b.inform(this.getProduct()));
    }
}
