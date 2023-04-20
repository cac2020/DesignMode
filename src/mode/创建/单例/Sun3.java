package mode.创建.单例;

/**
 * 懒汉式单例-静态内部类方式
 * 优点：延迟加载、保证效率、线程安全
 *
 * @author cac2020
 */
public class Sun3 {
    private Sun3(){}

    /**
     * 静态内部类特点：在第一个次访问时加载
     */
    private static class SingletonInstance{
        private static final Sun3 INSTANCE = new Sun3();
    }

    public static synchronized Sun3 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
