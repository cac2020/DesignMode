package mode.行为.策略;

public class KeyBoard implements USB {
    @Override
    public void read() {
        System.out.println("键盘指令数据……");
    }
}
