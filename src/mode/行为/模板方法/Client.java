package mode.行为.模板方法;


public class Client {
    public static void main(String[] args) {
        Mamal mammal = new Bat();
        mammal.live();

        mammal = new Whale();
        mammal.live();

        mammal = new Human();
        mammal.live();
        /**
         * 蝙蝠在空中飞着……抓小虫吃。
         * 鲸在水里游着……捕鱼吃。
         * 人类在路上开着车……去公司挣钱吃饭。
         */

        PM pm = new HrProject();
        pm.kickoff();

        pm = new APIProject();
        pm.kickoff();
    }
}
