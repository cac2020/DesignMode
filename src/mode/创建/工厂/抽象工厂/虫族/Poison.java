package mode.创建.工厂.抽象工厂.虫族;

import mode.创建.工厂.抽象工厂.MidClassUnit;

public class Poison extends MidClassUnit {
    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("毒液使用毒液喷射，攻击力："+getAttack());
    }
}
