package mode.创建.工厂.简单工厂;


public class Test {
    public static void main(String[] args){
        SimpleFactory factory = new SimpleFactory(100);
        System.out.println("开始游戏1");
        factory.create2("mode.创建.工厂.简单工厂.AirPlane").show();
        factory.create2("mode.创建.工厂.简单工厂.Tank").show();

        System.out.println("开始游戏2");
        factory.create("AirPlane").show();
        factory.create("Tank").show();
    }
}
