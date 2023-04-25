package mode.结构.适配器;

/**
 * 两相插头
 */
public interface DualPin {
    /**
     * 这里没有地线
     * @param l
     * @param n
     */
    public void electrify(int l, int n);
}
