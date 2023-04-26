package mode.行为.迭代器;

import java.util.Iterator;

public class DrivingRecorder implements Iterable<String> {
    // 当前记录位置
    private int index = -1;
    // 假设只能记录10条视频
    private String[] records = new String[10];

    public void append(String record) {
        //索引重置，从头覆盖
        if (index == 9) {
            index = 0;
        } else {
            index++;
        }
        records[index] = record;
    }

    @Override
    public Iterator<String> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<String> {
        int cursor = index;// 迭代器游标，不波及原始集合索引
        int loopCount = 0;

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }

        @Override
        public String next() {
            int i = cursor;// 记录即将返回的游标位置
            if (cursor == 0) {
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }
    };

}
