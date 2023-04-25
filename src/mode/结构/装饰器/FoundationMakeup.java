package mode.结构.装饰器;

/**
 * 打粉底装饰器
 */
public class FoundationMakeup extends Decorator {
    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
