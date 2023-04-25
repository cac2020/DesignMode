package mode.结构.代理.静态;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet {
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");
    /**
     * 静态代理
     * 被代理对象
     */
    private Internet modem;
    public RouterProxy() throws Exception {
        //实例化被代理类
        this.modem = new Modem("123456");
    }

    /**
     * //实现互联网访问接口方法
     * @param url
     */
    @Override
    public void httpAccess(String url) {
        //遍历黑名单
        for (String keyword : blackList) {
            //是否包含黑名单中的字眼
            if (url.contains(keyword)) {
                System.out.println("禁止访问：" + url);
                return;
            }
        }
        //转发请求至“猫”以访问互联网
        modem.httpAccess(url);
    }
}
