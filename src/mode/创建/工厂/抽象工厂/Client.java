package mode.创建.工厂.抽象工厂;

import mode.创建.工厂.抽象工厂.人族.HumanFactory;
import mode.创建.工厂.抽象工厂.虫族.AlienFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("游戏开始...");
        System.out.println("双方挖矿攒钱");

        //玩家1选择人族角色
        System.out.println("工人建造人族工厂");
        AbstractFactory humanFactory = new HumanFactory(10,10);
        LowClassUnit marine = humanFactory.createLowClass();
        marine.show();
        MidClassUnit tank = humanFactory.createMidClass();
        tank.show();
        HighClassUnit battleShip = humanFactory.createHighClass();
        battleShip.show();

        //玩家2选择虫族角色
        System.out.println("工蜂建造虫族工厂");
        AbstractFactory alienFactory = new AlienFactory(200,200);
        LowClassUnit roach = alienFactory.createLowClass();
        roach.show();
        MidClassUnit poison = alienFactory.createMidClass();
        poison.show();
        HighClassUnit mammoth = alienFactory.createHighClass();
        mammoth.show();

        //两族开始大混战
        marine.attack();
        roach.attack();
        tank.attack();
        poison.attack();
        battleShip.attack();
        mammoth.attack();

        System.out.println("游戏结束");
    }
}
