package mode.创建.工厂.工厂方法;

public class Airplane extends Enemy {

    public Airplane(int x, int y) {
        super(x, y);
    }

    @Override
    protected void show() {
        System.out.println("绘制飞机在上层图层，出现坐标：x="+x+",y="+y);
        System.out.println("飞机向玩家发起攻击");
    }
}
