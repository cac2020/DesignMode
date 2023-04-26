package mode.行为.策略;

public class Mouse implements USB {
    @Override
    public void read() {
        System.out.println("鼠标指令数据……");
    }
}
