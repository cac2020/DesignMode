package mode.结构.装饰器;

/**
 * 装饰指在某物件上装点额外饰品的行为，以使其原本朴素的外表 变得更加饱满、华丽
 *
 * 装饰器模式（Decorator）能够在运行时动态地为原始对象 增加一些额外的功能，使其变得更加强大
 *
 * 生活中案例：装修可以让毛坯房到精装房装修、化妆品可以让女生从素面朝天到花容月貌、俄罗斯套娃
 * 技术案例：JDK中IO流
 *
 */
public abstract class Decorator implements Showable{
    //被装饰的展示者
    protected Showable showable;
    //构造时注入被装饰者
    public Decorator(Showable showable){
        this.showable = showable;
    }

    @Override
    public void show() {
        //直接调用不加任何装饰
        showable.show();
    }
}
