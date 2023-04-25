package mode.结构.桥接;

public class CircleRuler implements Ruler {
    @Override
    public void regularize() {
        System.out.println("○");//输出圆形
    }
}
