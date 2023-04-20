package mode.创建.单例;

/**
 * 饱汉式单例：类装载的时候就完成了实例化
 * 优点：线程安全
 * 缺点：可能造成内存浪费
 * 使用场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多(即:重量级对象)，但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象(比如数据源、session工厂等)
 *
 * 全局唯一的东西：
 * 1.网站的计数器：全局计数
 * 2,应用配置：全局共用一套配置
 * 3.多线程池：区局共用线程
 * 4.数据库配置 数据库连接池：全局共用数据库连接
 * 5.应用程序的日志应用：全局共用一个文件流
 *
 * @author cac2020
 */
public class Sun1 {
    /**
     * private外界不能访问
     * static静态常量 一起动就会运行
     * final 不可修改引用
     */
    private static final Sun1 INSTANCE = new Sun1();

    /**
     * 私有构造器 外界不能访问
     */
    private Sun1(){}

    /**
     * public 供外部使用
     * static 静态方法 通过类直接调用 而不需要实例化
     * @return
     */
    public static Sun1 getSingleton(){
        return INSTANCE;
    }
}
