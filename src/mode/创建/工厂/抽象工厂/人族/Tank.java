package mode.创建.工厂.抽象工厂.人族;

import mode.创建.工厂.抽象工厂.MidClassUnit;

public class Tank extends MidClassUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("坦克使用炮轰击，攻击力："+getAttack());
    }
}
