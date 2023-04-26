package mode.行为.状态.红绿灯;

public interface State {
    void switchToGreen(TrafficLight trafficLight);//切换为绿灯（通行）状态

    void switchToYellow(TrafficLight trafficLight);//切换为黄灯（警示）状态

    void switchToRed(TrafficLight trafficLight);//切换为红灯（禁行）状态

}
