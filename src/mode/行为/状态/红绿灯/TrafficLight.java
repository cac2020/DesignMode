package mode.行为.状态.红绿灯;

/**
 * 交通灯只是持有当前 的状态，至于到底该如何响应及进行状态切换，全权交由当前状态对象处理。
 */
public class TrafficLight {
    //交通灯有红灯（禁行）、黄灯（警示）、绿灯（通行） 3种状态
    State state = new Red();//初始状态为红灯

    public void setState(State state) {
        this.state = state;
    }

    //切换为绿灯（通行）状态
    public void switchToGreen() {
        state.switchToGreen(this);
    }

    //切换为黄灯（警示）状态
    public void switchToYellow() {
        state.switchToYellow(this);
    }

    //切换为红灯（禁行）状态
    public void switchToRed() {
        state.switchToRed(this);
    }

}
