package mode.创建.原型.seril;

import java.io.Serializable;

/**
 * 原型模式--序列化方法
 *
 * @author cac2020
 */
public class Location implements Serializable {
    private String x;
    private String y;

    public Location(String x, String y) {
        this.x = x;
        this.y = y;
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
