package mode.创建.工厂.抽象工厂;

/**
 *        低级兵种     中级兵种     高级兵种
 * 人族   陆战士兵  |  变形坦克  |  巨型战舰
 * 虫族   蟑螂兵   |  毒液      |  猛犸
 * 抽象工厂：工厂的工厂
 * 适用 更加复杂的产品族系，类似于一种对“工业制造标准”的制定和推行，以工厂类来划分产品族，以制造方法划分产品系列
 *
 * 总结：根绝业务的复杂程度选择不同的工厂：简单工厂  --> 工厂方法  --> 抽象工厂
 */
public interface AbstractFactory {
    LowClassUnit createLowClass();
    MidClassUnit createMidClass();
    HighClassUnit createHighClass();
}
