package mode.创建.工厂.工厂方法;

public class Tank extends Enemy {
    public Tank(int x,int y){
        super(x,y);
    }
    @Override
    protected void show() {
        System.out.println("绘制坦克在下层图层，出现坐标：x="+x+",y="+y);
        System.out.println("坦克向玩家发起攻击");
    }
}
