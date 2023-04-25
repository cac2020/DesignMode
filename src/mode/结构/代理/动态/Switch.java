package mode.结构.代理.动态;

/**
 * 交换机
 */
public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
