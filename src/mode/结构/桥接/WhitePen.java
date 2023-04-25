package mode.结构.桥接;

public class WhitePen extends Pen {
    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白色");
        ruler.regularize();
    }
}
