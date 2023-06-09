package mode.行为.状态.二元开关;

/**
 * 状态指事物基于所处的状况、形态表现出的不同的行为特性。状
 * 态模式（State）构架出一套完备的事物内部状态转换机制，并将内部
 * 状态包裹起来且对外部不可见，使其行为能随其状态的改变而改变，
 * 同时简化了事物的复杂的状态变化逻辑
 *
 * 生活案例：不同温度的水会呈现不同体态（固体、液体、气体），不同心情的人会表现出不同的行为，电灯通电断电对应两个结果：亮、灭
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 在开灯方法与关灯方法中加入了逻辑
         * 判断。如果正常切换状态则通过校验，使灯亮或灭，否则重复开或重
         * 复关的话则不进行操作并警告用户不必再次操作
         */
        Switcher s = new Switcher();
        s.switchOff();//ERROR!!!关闭状态下无须再关闭
        s.switchOn();//OK...使灯亮
        s.switchOff();//OK...使灯灭
        s.switchOn();//OK...使灯亮
        s.switchOn();//ERROR!!!开启状态下无须再开启
    }
}
