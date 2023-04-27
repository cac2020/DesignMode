package mode.行为.解释器;

import java.util.Arrays;

/**
 * 解释有拆解、释义的意思，一般可以理解为针对某段文字，按照
 * 其语言的特定语法进行解析，再以另一种表达形式表达出来，以达到
 * 人们能够理解的目的。类似地，解释器模式（Interpreter）会针对某
 * 种语言并基于其语法特征创建一系列的表达式类（包括终极表达式与
 * 非终极表达式），利用树结构模式将表达式对象组装起来，最终将其
 * 翻译成计算机能够识别并执行的语义树。例如结构型数据库对查询语
 * 言SQL的解析，浏览器对HTML语言的解析，以及操作系统Shell对命令
 * 的解析。不同的语言有着不同的语法和翻译方式，这都依靠解释器完成。
 *
 * 使用场景：语法解析执行、规则校验器
 *
 */
public class Client {
    public static void main(String[] args) {
        /*
         * BEGIN // 脚本开始
         * MOVE 500,600; // 鼠标指针移动到坐标(500, 600)
         * BEGIN LOOP 5 // 开始循环5次
         * LEFT_CLICK; // 循环体内单击左键
         * DELAY 1; // 每次延迟1秒
         * END; // 循环体结束
         * RIGHT_DOWN; // 按下右键
         * DELAY 7200; // 延迟2小时
         * END; // 脚本结束
         */

        // 构造指令集语义树，实际情况会交给语法分析器（Evaluator or Parser）
        Expression sequence = new Sequence(
                Arrays.asList(
                    new Move(500, 600),
                    new Repetition(
                        new Sequence(
                                Arrays.asList(new LeftKeyClick(), new Delay(1))
                        ),
                        5 // 循环5次
                ),
                new LeftKeyDown(),
                new Delay(7200)
        ));
        sequence.interpret();
    }
}
