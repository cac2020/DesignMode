package mode.行为.解释器;

public class LeftKeyUp implements Expression {
    @Override
    public void interpret() {
        System.out.println("松开鼠标：左键");
    }
}
