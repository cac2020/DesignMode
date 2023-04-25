package mode.结构.桥接;

public class BlackPen extends Pen {
    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑色");
        ruler.regularize();
    }
}
