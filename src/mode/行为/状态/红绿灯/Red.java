package mode.行为.状态.红绿灯;

public class Red implements State {
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("ERROR!!!红灯不能切换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("OK...黄灯亮起5秒");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("ERROR!!!已是红灯状态无须再切换");
    }
}
