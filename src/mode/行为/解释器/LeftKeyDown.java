package mode.行为.解释器;

public class LeftKeyDown implements Expression {
    @Override
    public void interpret() {
        System.out.println("按下鼠标：左键");
    }
}
