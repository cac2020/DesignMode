package mode.创建.工厂.简单工厂;

public class AirPlane extends Enemy {
    public AirPlane(int x, int y) {
        super(x, y);
    }

    @Override
    protected void show() {
        System.out.println("绘制飞机在上层图层，出现坐标：x="+x+",y="+y);
        System.out.println("飞机向玩家发起攻击");
    }
}
