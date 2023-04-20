package mode.创建.单例;

/**
 * 懒汉式单例-双重检查
 * 优点：延迟加载、保证效率、线程安全
 *
 * @author cac2020
 */
public class Sun2 {
    /**
     * volatile 防止编译器优化 保证内存可见性
     * static 静态常量 限定作用域
     *
     */
    private volatile static Sun2 INSTANCE = null;

    private Sun2(){}

    public static Sun2 getSigleton(){
        if (INSTANCE == null){
            //进入大括号前的线程 如果sun已创建会被sun == null拦住
            //进入大括号后 synchronized之前会有一些线程  所以进入synchronized之后还需要再次判断sun == null
            synchronized(Sun2.class){
                if (INSTANCE == null){
                    INSTANCE = new Sun2();
                }
            }
        }
        return INSTANCE;
    }
}
