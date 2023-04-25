package mode.结构.桥接;

/**
 * 三角形
 */
public class TriangleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("△");//输出三角形
    }
}
