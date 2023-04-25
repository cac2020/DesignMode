package mode.行为.模板方法;

public class Human extends Mamal {
    @Override
    public void move() {
        System.out.print("人类在路上开着车……");
    }

    @Override
    public void eat() {
        System.out.println("去公司挣钱吃饭。");
    }
}
