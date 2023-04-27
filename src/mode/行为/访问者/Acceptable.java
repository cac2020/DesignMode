package mode.行为.访问者;

public interface Acceptable {
    //主动接待访问者
    public void accept(Visitor visitor);
}
