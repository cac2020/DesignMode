package mode.结构.适配器;

/**
 * 类专属适配器
 * 属于专属适配器，专用于一种设备 不方便扩展，但是相对于对象适配器 实现更方便
 */
public class TVAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int n, int e) {
        super.electrify(l,n);
    }
}
