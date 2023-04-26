package mode.行为.策略;

/**
 * 策略，古时也称“计”，指为了达成某个目标而提前策划好的方
 * 案。但计划往往不如变化快，当目标突变或者周遭情况不允许实施某
 * 方案的时候，我们就得临时变更方案。策略模式（Strategy）强调的
 * 是行为的灵活切换，比如一个类的多个方法有着类似的行为接口，可
 * 以将它们抽离出来作为一系列策略类，在运行时灵活对接，变更其算
 * 法策略，以适应不同的场景
 *
 * 案例：传统的俄罗斯方块游戏机-->到后来的插卡游戏机，体现的就是 策略与系统分离的设计看起来非常灵活
 * 技术案例：产品提供接口 项目进行个性化的自定义类开发
 */
public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();//实例化计算器
        calculator.setStrategy(new Addition());//注入加法策略实现
        System.out.println(calculator.getResult(1, 1));//输出结果为2

        calculator.setStrategy(new Subtraction());//再注入减法策略实现
        System.out.println(calculator.getResult(1, 1));// 输出结果为0

        Computer com = new Computer();

        com.setUsb(new KeyBoard());//插入键盘
        com.compute();

        com.setUsb(new Mouse());//插入鼠标
        com.compute();

        com.setUsb(new Camera());//插入摄像头
        com.compute();

    }
}
