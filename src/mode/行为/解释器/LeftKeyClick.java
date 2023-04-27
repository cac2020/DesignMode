package mode.行为.解释器;

public class LeftKeyClick implements Expression {
    private Expression leftKeyDown;
    private Expression leftKeyUp;

    public LeftKeyClick() {
        this.leftKeyDown = new LeftKeyDown();
        this.leftKeyUp = new LeftKeyUp();
    }
    @Override
    public void interpret() {
        //单击=先按下再松开，于是分别调用二者的解释方法即可
        leftKeyDown.interpret();
        leftKeyUp.interpret();
    }
}
