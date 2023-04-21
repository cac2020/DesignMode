package mode.创建.工厂.工厂方法;

/**
 * 不仅将创建不同对象的类进行分开，将创建各种对象的工厂也进行分开 各自进行自己的个性化创建 而不影响其他对象
 * 非常符合开闭原则
 * 缺点：每种产品都要有对应的工厂，产品越多 工厂越多，为了避免工厂泛滥，可以适用抽象工厂进行顶级抽象
 */
public interface Factory {
    Enemy create(int screenWidth);
}
