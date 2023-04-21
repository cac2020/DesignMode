package mode.创建.工厂.工厂方法;

public class Client {
    public static void main(String[] args) {
        int screenWidth = 100;
        System.out.println("游戏开始");

        Factory tankFactory = new TankFactory();
        for (int i=0;i<5;i++){
            tankFactory.create(screenWidth).show();
        }

        Factory airplaneFactory = new AirplaneFactory();
        for (int i=0;i<5;i++){
            airplaneFactory.create(screenWidth).show();
        }

        Factory bossFactory = new BossFactory();
        bossFactory.create(screenWidth).show();

        System.out.println("游戏结束");
    }
}
