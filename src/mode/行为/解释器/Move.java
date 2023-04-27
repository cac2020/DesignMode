package mode.行为.解释器;


public class Move implements Expression {
    // 鼠标指针位置坐标
    private int x, y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void interpret() {
        System.out.println("移动鼠标：【" + x + "," + y + "】");
    }
}
