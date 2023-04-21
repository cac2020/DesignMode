package mode.创建.工厂.抽象工厂.人族;

import mode.创建.工厂.抽象工厂.HighClassUnit;

public class Battleship extends HighClassUnit {
    public Battleship(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("战舰使用激光炮打击，攻击力："+getAttack());
    }
}
