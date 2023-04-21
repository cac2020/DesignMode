package mode.创建.工厂.抽象工厂.虫族;

import mode.创建.工厂.抽象工厂.AbstractFactory;
import mode.创建.工厂.抽象工厂.HighClassUnit;
import mode.创建.工厂.抽象工厂.LowClassUnit;
import mode.创建.工厂.抽象工厂.MidClassUnit;

/**
 * 虫族兵工厂
 */
public class AlienFactory implements AbstractFactory {
    private int x;
    private int y;

    public AlienFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Roach(x,y);
        System.out.println("制造蟑螂兵成功");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Poison(x,y);
        System.out.println("制造毒液兵成功");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Mammoth(x,y);
        System.out.println("制造猛犸巨兽成功");
        return unit;
    }
}
