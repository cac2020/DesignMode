package mode.创建.建造者;

/**
 * 客户端
 * 建造者模式（Builder）所构建的对象一定是庞大而复杂的，并且一定是按照既定的制造工序将组件组装起来的
 * 开发商--->工程总监--->施工方--->最终产品：房屋（整个流程是一个引用关系）
 * 开发商将房屋建造标准交给工程总监，工程总监控制施工方去按照标准进行施工，施工方只进行施工，整体是一个
 */
public class Client {
    public static void main(String[] args) {
        //组建别墅施工队
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());
        //替换施工队，建造公寓
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
