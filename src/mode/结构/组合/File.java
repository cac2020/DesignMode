package mode.结构.组合;

public class File extends Node {
    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node node) {
        System.err.println("当前是文件，不能添加子文件");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}
