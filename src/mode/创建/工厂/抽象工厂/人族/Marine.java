package mode.创建.工厂.抽象工厂.人族;

import mode.创建.工厂.抽象工厂.LowClassUnit;

public class Marine extends LowClassUnit {
    public Marine(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("士兵出现在坐标：["+x+","+y+"]");
    }

    @Override
    public void attack() {
        System.out.println("士兵使用机关枪射击，攻击力："+getAttack());
    }
}
