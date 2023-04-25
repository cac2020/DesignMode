package mode.结构.亨元;

/**
 * Flyweight（享元接口）：所有元件的高层规范，声明与外蕴状态
 * 互动的接口标准
 */
public interface Drawable {
    /**
     * 绘图方法，接收地图坐标
     **/
    void draw(int x, int y);
}
