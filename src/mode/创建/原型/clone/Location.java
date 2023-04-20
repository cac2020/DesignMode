package mode.创建.原型.clone;

/**
 * 原型模式--克隆方式
 *
 * @author cac2020
 */
public class Location implements Cloneable{
    private String x;
    private String y;

    public Location(String x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
