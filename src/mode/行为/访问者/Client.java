package mode.行为.访问者;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 访问者模式（Visitor）主要解决的是数据与算法的耦合问题，尤
 * 其是在数据结构比较稳定，而算法多变的情况下。为了不“污染”数
 * 据本身，访问者模式会将多种算法独立归类，并在访问数据时根据数
 * 据类型自动切换到对应的算法，实现数据的自动响应机制，并且确保
 * 算法的自由扩展
 *
 * 众所周知，对数据的封装，我们常常会用到POJO类，它除get和
 * set方法之外不应包含任何业务逻辑，也就是说它只封装了一组数据且
 * 不具备任何数据处理能力，最常见的如做OR-Mapping时数据库表所对
 * 应的持久化对象（Persistent Object，PO）或转换后的值对象
 * （Value Object，VO）。因为数据库是相对稳定的，所以这些POJO类亦是如此。反之，业务逻辑却是灵活多变的，所以通常我们不会将业
 * 务逻辑封装在这些数据类里面，而是交给专门的业务类（business
 * service）（或者算法类）去处理。此时我们可以加入“访问者”模
 * 块，并根据不同类型的数据开展不同的业务，最终达到期望的响应结果。
 *
 * 使用场景：
 * 访问者模式的核心在于对重载方法与双派发方式的利用，
 * 这是实现数据算法自动响应机制的关键所在。而对于其优秀算法的扩
 * 展是建立在稳定的数据基础之上的，对于数据多变的情况，我们就得
 * 对系统大动干戈了，所有的访问者重载方法都要被修改一遍，所以读
 * 者需要特别注意，对于这种情况并不推荐使用访问者模式
 *
 * 1.一个对象结构中包含多个类型的对象，希望对这些对象实施一些依赖其具体类型的操作
 * 2.需要对一个对象结构中的对象进行很多不同的并且不相关的操作
 * 3.对象结构中对象对应的类很少改变，但经常需要在此对象结构上定义新的操作
 *
 */
public class Client {

    public static void main(String[] args) {
        // 将3件商品加入购物车
        List<Acceptable> products = Arrays.asList(
                new Candy("小兔奶糖", LocalDate.of(2018, 10, 1),20.00f),
                new Wine("老猫白酒", LocalDate.of(2017, 1, 1),1000.00f),
                new Fruit("草莓", LocalDate.of(2018, 12, 26), 10.00f,2.5f)
        );

        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2018, 1, 1));
        // 迭代购物车中的商品
        for (Acceptable product : products) {
            //discountVisitor.visit(product);// 此处会报错
            product.accept(discountVisitor);
        }
        /**
         * 结算日期：2018-01-01
         * =====糖果【小兔奶糖】打折后价格=====
         * ￥18.00
         * =====酒【老猫白酒】无折扣价格=====
         * ￥1,000.00
         * =====水果【草莓】打折后价格=====
         * ￥25.00
         */
    }

}
