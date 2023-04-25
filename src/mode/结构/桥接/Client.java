package mode.结构.桥接;

/**
 * 桥接模式（Bridge）能将抽象与实现分离，使二者可以各自单独
 * 变化而不受对方约束，使用时再将它们组合起来，就像架设桥梁一样
 * 连接它们的功能，如此降低了抽象与实现这两个可变维度的耦合度，
 * 以保证系统的可扩展性
 *
 */
public class Client {
    /**
     * 桥接模式将原本对形状的继承关系改为聚合
     * （组合）关系，使形状实现从颜色中分离出来，最终完成多类组件维
     * 度上的自由扩展与拼装，使形与色的自由搭配成为可能。
     *
     * 假如有10种颜色 10种形状，如果按照每种组合一个实现需要10*10=100种组合类，而通过桥接 只需要10种颜色类+10种形状类连接使用即可
     *
     * @param args
     */
    public static void main(String[] args) {
        //白色画笔对应的所有形状
        new WhitePen(new CircleRuler()).draw();
        new WhitePen(new SquareRuler()).draw();
        new WhitePen(new TriangleRuler()).draw();

        //黑色画笔对应的所有形状
        new BlackPen(new CircleRuler()).draw();
        new BlackPen(new SquareRuler()).draw();
        new BlackPen(new TriangleRuler()).draw();
        /**
         * 白色○
         * 白色□
         * 白色△
         * 黑色○
         * 黑色□
         * 黑色△
         */
    }
}
