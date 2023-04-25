package mode.结构.桥接;

/**
 * 正方形
 */
public class SquareRuler implements Ruler{
    @Override
    public void regularize() {
        System.out.println("□");//输出正方形
    }
}
