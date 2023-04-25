package mode.结构.代理.静态;

/**
 * 代理模式（Proxy），顾名思义，有代表打理的意思。某些情况
 * 下，当客户端不能或不适合直接访问目标业务对象时，业务对象可以
 * 通过代理把自己的业务托管起来，使客户端间接地通过代理进行业务
 * 访问。如此不但能方便用户使用，还能对客户端的访问进行一定的控
 * 制。简单来说，就是代理方以业务对象的名义，代理了它的业务。
 *
 * 不管是在编程时预定义静态代理，还是在运行时即时生成代理，
 * 它们的基本理念都是通过拦截被代理对象的原始业务并在其之前或之
 * 后加入一些额外的业务或者控制逻辑，来最终实现在不改变原始类
 * （被代理类）的情况下对其进行加工、管控
 *
 * 生活案例：销售代理商（4S店）；房屋中介；上网代理（路由器）
 * 技术案例：Spring AOP ,比如Spring事务就是用的代理
 *
 * 代理模式内部会实例化代理对象，装饰器模式从外部传入目标对象。
 * 虽然二者的理念与实现有点类似，但装饰器模式往往更加关注为其他对象增加功能，让客户端更加灵活地进行组件搭配；
 * 而代理模式更强调的则是一种对访问的管控，甚至是将被代理对象完全封装而隐藏起来，使其对客户端完全透明
 *
 * 下面实现一个 路由器代理猫来上网的功能
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //实例化的是代理
        Internet proxy = new RouterProxy();
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("ftp://www.学习.com/java");
        proxy.httpAccess("http://www.工作.com");

         /* 运行结果
     拨号上网……连接成功！
禁止访问：http://www.电影.com
禁止访问：http://www.游戏.com
正在访问：ftp://www.学习.com/java
正在访问：http://www.工作.com
     */
    }
}
