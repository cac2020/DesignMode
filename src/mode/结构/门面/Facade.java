package mode.结构.门面;

/**
 * 门面模式（Facade）或者外观模式可能是最简单的结构型设计模式，它能将多个不同的子系统接口封装起来，并对外提供统一的高层接口，使复杂的子系统变得更易使用，
 * 对庞大复杂的子系统进行了二次封装，把原本复杂的操作接口全都隐藏起来，并在内部加入逻辑使各参数在拍照前进行自动调节，最终只为外界提供一个简单方便的快门按键，让用户能够“一键操作”
 * 举例：日常生活中的一键操作：例如傻瓜相机对对焦、调节闪光灯、调光圈等操作的封装；全自动洗衣机对浸泡、漂洗、甩干、排水等一系列操作的封装；
 * 专业的事情还是应该交给专业的人去完成，他们会把这些子系统的操作过程封装起来，再以更为便捷的方式提供给用户使用
 *
 * 外观门面类内部封装了大量的子系统资源，如蔬菜商、厨师、服务员、洗碗工，并在构造方法中依次对各
 * 个子系统进行了初始化操作，也就是说餐厅在开门前需要提前准备好这些资源，以便在点菜方法order()中进行依次调度
 *
 * 餐饮门店要对子系统及其调度进行封装，化繁为简的一站式服务才能解放用户的双手
 */
public class Facade {
    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade() {
        this.vegVendor = new VegVendor();
        //开门前就找蔬菜商准备好蔬
        vegVendor.purchase();
        //雇佣厨师
        this.chef = new Chef();
        //雇佣服务员
        this.waiter = new Waiter();
        //雇佣清洁工、洗碗工等
        this.cleaner = new Cleaner();
    }

    public void order(){
        //接待 下单 点菜
        waiter.order();
        //出事炒菜
        chef.cook();
        //上菜
        waiter.serve();
        //客人走后打扫卫生
        cleaner.clean();
    }

}
