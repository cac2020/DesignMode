package mode.行为.模板方法;
/**
 * 模板是对多种事物的结构、形式、行为的模式化总结，而模板方
 * 法模式（Template Method）则是对一系列类行为（方法）的模式化。
 * 我们将总结出来的行为规律固化在基类中，对具体的行为实现则进行
 * 抽象化并交给子类去完成，如此便实现了子类对基类模板的套用
 */
public abstract class Mamal {

    public abstract void move();
    public abstract void eat();

    /**确定的行为通过基类来确定 使用final不允许继承修改*/
    public final void live(){
        move();
        eat();
    }
}
