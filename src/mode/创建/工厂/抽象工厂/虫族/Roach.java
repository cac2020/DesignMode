package mode.创建.工厂.抽象工厂.虫族;

import mode.创建.工厂.抽象工厂.LowClassUnit;

public class Roach extends LowClassUnit {
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂兵出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂兵使用爪子挠，攻击力："+getAttack());
    }
}
