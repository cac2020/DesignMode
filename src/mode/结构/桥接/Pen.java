package mode.结构.桥接;

public abstract class Pen {
    //组合引入尺子
    protected Ruler ruler;
    public Pen(Ruler ruler){
        this.ruler = ruler;
    }
    //具体颜色画笔子类去实现绘画方法
    public abstract void draw();
}
