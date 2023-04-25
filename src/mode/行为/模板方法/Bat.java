package mode.行为.模板方法;

public class Bat extends Mamal {
    @Override
    public void move() {
        System.out.print("蝙蝠在空中飞着……");
    }

    @Override
    public void eat() {
        System.out.println("抓小虫吃。");
    }
}
