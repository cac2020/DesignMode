package mode.结构.亨元;

/**
 * 享元实现-房屋图件
 */
public class House implements Drawable {
    //房屋图片材质
    private String image;

    public House() {
        this.image = "房屋";
        System.out.print("从磁盘加载[" + image + "]图片，耗时半秒……");
    }
    @Override
    public void draw(int x, int y) {
        //房屋盖在地板上，所以切换到顶层图层
        System.out.print("将图层切换到顶层……");
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
