package mode.创建.工厂.工厂方法;

public class Boss extends Enemy {

    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    protected void show() {
        System.out.println("绘制Boss在中间，出现坐标：x="+x+",y="+y);
        System.out.println("Boss向玩家发起攻击");
    }
}
