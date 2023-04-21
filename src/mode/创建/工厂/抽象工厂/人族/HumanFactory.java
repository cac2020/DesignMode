package mode.创建.工厂.抽象工厂.人族;

import mode.创建.工厂.抽象工厂.AbstractFactory;
import mode.创建.工厂.抽象工厂.HighClassUnit;
import mode.创建.工厂.抽象工厂.LowClassUnit;
import mode.创建.工厂.抽象工厂.MidClassUnit;

/**
 * 人族士兵工厂
 */
public class HumanFactory implements AbstractFactory {
    private int x;
    private int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Marine(x,y);
        System.out.println("制造人族士兵成功");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Tank(x,y);
        System.out.println("制造坦克成功");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Battleship(x,y);
        System.out.println("制造战舰成功");
        return unit;
    }
}
