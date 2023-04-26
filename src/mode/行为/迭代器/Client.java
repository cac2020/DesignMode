package mode.行为.迭代器;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代，在程序中特指对某集合中各元素逐个取用的行为。迭代器
 * 模式（Iterator）提供了一种机制来按顺序访问集合中的各元素，而
 * 不需要知道集合内部的构造。换句话讲，迭代器满足了对集合迭代的
 * 需求，并向外部提供了一种统一的迭代方式，而不必暴露集合的内部
 * 数据结构
 *
 *  数据容器结构类实现Iterable接口 可以返回迭代器
 *  内部迭代器需要实现Iterable接口 用来遍历
 */
public class Client {
    public static void main(String[] args) {
        DrivingRecorder dr = new DrivingRecorder();
        // 假设记录了12条视频
        for (int i = 0; i < 12; i++) {
            dr.append("视频_" + i);
        }
        //用户的U盘，用于复制交通事故视频
        List<String> uStorage = new ArrayList<>();

        //获取迭代器
        Iterator<String> it = dr.iterator();
        while (it.hasNext()) {
            //如果还有下一条则继续迭代
            String video = it.next();
            System.out.println(video);
            //用户翻看视频发现第10条和第8条可作为证据
            if("视频_10".equals(video) || "视频_8".equals(video)){
                uStorage.add(video);
            }
        }
        //最后将U盘交给交警查看
        System.out.println("事故证据：" + uStorage);
        /**
         * 视频_11
         * 视频_10
         * 视频_9
         * 视频_8
         * 视频_7
         * 视频_6
         * 视频_5
         * 视频_4
         * 视频_3
         * 视频_2
         * 事故证据：[视频_10, 视频_8]
         */
    }
}
