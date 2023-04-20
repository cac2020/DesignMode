package mode.创建.单例;

/**
 * 枚举单例- 使用枚举可以实现单例
 * 优点：不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 使用场景：表示业务的多种状态
 * @author cac2020
 */
public enum Sun4 {
    INSTANCE;
    public void doSomething(){
        System.out.println("doSomething...");
    }
}
