package mode.结构.组合;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node {

    //文件夹可以包含文件和子文件夹
    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    protected void add(Node node) {
        childrenNodes.add(node);
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
        space ++;
        for (Node node : childrenNodes){
            node.tree(space);
        }
    }
}
