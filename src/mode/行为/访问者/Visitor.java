package mode.行为.访问者;

/**
 * 访问者接口
 */
public interface Visitor {
    void visit(Candy candy);// 糖果重载方法
    void visit(Wine wine);// 酒类重载方法
    void visit(Fruit fruit);// 水果重载方法
}
