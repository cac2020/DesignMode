package mode.结构.代理.动态;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 黑名单过滤代理
 * 1.基于JDK实现的动态代理
 * 2.CGLIB动态代理
 * CGlib生成代理类比JDK动态代理效率低，CGLib执行效率比JDK高
 */
public class BlackListFilter implements InvocationHandler {
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    /**
     * 被代理的真实对象，如“猫”、交换机等
     */
    private Object origin;

    public BlackListFilter(Object origin) {
        //注入被代理对象
        this.origin = origin;
        System.out.println("开启黑名单过滤功能……");
    }

    @Override
    public Object invoke(Object proxy, Method mth, Object[] args) throws Throwable {
        //切入“方法面”之前的过滤器逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)) {
                System.out.println("禁止访问：" + arg);
                return null;
            }
        }
        //调用被代理对象方法
        System.out.println("校验通过，转向实际业务……");
        return mth.invoke(origin, arg);
    }

}
