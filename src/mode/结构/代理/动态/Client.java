package mode.结构.代理.动态;

import java.lang.reflect.Proxy;

/**
 * 动态代理使用场景：
 * 1、代理模式最常用的一个应用场景就是，在业务系统中开发一些非功能性需求，比如：监控、统计、鉴权、限流、事务、幂等、日志。
 */
public class Client {
    /**
     * 将管控业务（地址校验业务）完全抽离，并独立
     * 于系统主业务，也就是说，管控业务不再侵入实际业务类。并且，我
     * 们能够更加灵活地将这段业务逻辑加入不同的业务对象，如此，我们
     * 再也不必在编程时针对某个业务类量身定做其特有的代理类了，达到
     * 了一劳永逸的目的。
     * @param args
     */
    public static void main(String[] args) {
        //访问局域网（内网），生成交换机代理
        Intranet intranet = (Intranet) Proxy.newProxyInstance(
                Switch.class.getClassLoader(),
                Switch.class.getInterfaces(),
                new BlackListFilter(new Switch()));
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\IronHuman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\shared\\Java学习资料.zip");
        intranet.fileAccess("\\\\192.68.1.6\\Java\\设计模式.doc");
        /**
         * 开启黑名单过滤功能……
         * 禁止访问：\\192.68.1.2\共享\电影\IronHuman.mp4
         * 禁止访问：\\192.68.1.2\共享\游戏\Hero.exe
         * 校验通过，转向实际业务……
         * 访问内网：\\192.68.1.4\shared\Java学习资料.zip
         * 校验通过，转向实际业务……
         * 访问内网：\\192.68.1.6\Java\设计模式.doc
         */
    }
}
