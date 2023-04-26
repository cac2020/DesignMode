package mode.行为.命令;

import java.util.Arrays;

/**
 * 命令是一个对象向另一个或多个对象发送的指令信息。命令的发
 * 送方负责下达指令，接收方则根据命令触发相应的行为。作为一种数
 * 据（指令信息）驱动的行为型设计模式，命令模式（Command）能够将
 * 指令信息封装成一个对象，并将此对象作为参数发送给接收方去执
 * 行，以使命令的请求方与执行方解耦，双方只通过传递各种命令过象
 * 来完成任务。此外，命令模式还支持命令的批量执行、顺序执行以及
 * 命令的反执行等操作
 *
 * 日常案例：遥控器对电视机发出的换台、调音量等指令；
 * 将军针对士兵执行进攻、撤退或者先退再进的任务所下达的一系列命令；
 * 餐厅中顾客为了让厨师按照自己的需求烹饪所需的菜品，需要与服务员确定的点菜单。
 * 在进行数据库的增、删、改、查时，用户会向数据库发送SQL语句来执行相关操作，或提交回滚操作，这也与命令模式非常类似。
 *
 * 命令模式
 * 其实与策略模式非常类似，只不过前者较后者多了一层封装，命令接
 * 口的统一确立，使系统可以忽略命令执行方接口的多样性与复杂性，
 * 将接口对接与业务逻辑交给具体的命令去实现，并且实现命令的无限
 * 扩展。松散的系统架构让所有模块真正实现端到端的无障碍通信，使
 * 系统兼容性获得极大的提升
 *
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        Switcher switcher = new Switcher();//命令请求方
        Bulb bulb = new Bulb();//命令执行方
        Command switchCommand = new SwitchCommand(bulb);//开关命令

        switcher.setCommand(switchCommand);//为开关绑定开关命令
        switcher.buttonPush();
        switcher.buttonPop();
        /**
         * 按下按钮……
         * 灯亮。
         * 弹起按钮……
         * 灯灭。
         */
        switcher.setCommand(new FlashCommand(bulb));
        switcher.buttonPush();
        Thread.sleep(3000);//此处观看一会闪烁效果再结束任务
        switcher.buttonPop();
        /**
         * 按下按钮……
         * 霓虹灯闪烁任务启动
         * 灯亮。
         * 灯灭。
         * 灯亮。
         * 灯灭。
         * 灯亮。
         * 灯灭。
         * 弹起按钮……
         * 霓虹灯闪烁任务结束
         */

        Keyboard keyboard = new Keyboard();
        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);
        Command tvChannelUpCommand = new TVChannelUpCommand(tv);

        //按键与命令映射
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.F1,
                Arrays.asList(tvOnCommand)
        );
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.UP,
                Arrays.asList(tvChannelUpCommand)
        );
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.ESC,
                Arrays.asList(tvOffCommand)
        );

        //触发按键
        keyboard.onKeyPressed(Keyboard.KeyCode.F1);
        keyboard.onKeyPressed(Keyboard.KeyCode.LEFT);
        keyboard.onKeyPressed(Keyboard.KeyCode.UP);
        keyboard.onKeyPressed(Keyboard.KeyCode.ESC);
        /**
         * F1键按下……
         *  电视机开启
         * LEFT键按下……
         *  警告：无效的命令。
         * UP键按下……
         *  电视机频道+
         * ESC键按下……
         *  电视机关闭
         */

        /**
         * 客户端还要求对灯泡进行控制，并且实现从开灯到电
         * 视开机并调节至最佳音量的一键式宏命令操作
         */
        Command bulbOnCommand = new SwitchCommand(bulb);
        keyboard.bindKeyCommand(
                Keyboard.KeyCode.F2,
                Arrays.asList(
                        bulbOnCommand,//将开灯命令也加入按键命令映射
                        tvOnCommand,
                        tvChannelUpCommand,
                        tvChannelUpCommand,
                        tvChannelUpCommand
                )
        );
        keyboard.onKeyPressed(Keyboard.KeyCode.F2);
    }
}
