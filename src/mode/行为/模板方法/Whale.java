package mode.行为.模板方法;

public class Whale extends Mamal {
    @Override
    public void move() {
        System.out.print("鲸在水里游着……");
    }

    @Override
    public void eat() {
        System.out.println("捕鱼吃。");
    }
}
