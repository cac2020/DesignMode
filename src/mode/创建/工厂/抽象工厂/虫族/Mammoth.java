package mode.创建.工厂.抽象工厂.虫族;

import mode.创建.工厂.抽象工厂.HighClassUnit;

public class Mammoth extends HighClassUnit {
    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸巨兽出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("猛犸巨兽使用獠牙顶，攻击力："+getAttack());
    }
}
