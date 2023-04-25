package mode.结构.适配器;

/**
 * 三相接口插座
 */
public interface TriplePin {
    /**
     * 参数分别为火线、零线、地线
     * @param l
     * @param n
     * @param e
     */
    public void electrify(int l, int n, int e);
}
