package mode.结构.组合;

/**
 * 组合模式（Composite）是针对由多个节点对象（部分）组成的树
 * 形结构的对象（整体）而发展出的一种结构型设计模式，它能够使客
 * 户端在操作整体对象或者其下的每个节点对象时做出统一的响应，保
 * 证树形结构对象使用方法的一致性，使客户端不必关注对象的整体或
 * 部分，最终达到对象复杂的层次结构与客户端解耦的目的
 *
 * 叉树结构：比如二叉树，无论拿出哪一个“部分”，其与“整体”的结构都是类似的，所以首先我们需要模糊根、枝、叶之间的差异，以实现节点的统一
 *
 * 典型案例：文件系统
 */

/**
 * 文件 文件夹节点抽象类
 */
public abstract class Node {
    protected String name;
    public Node(String name){
        this.name = name;
    }

    /**添加节点方法*/
    protected abstract void add(Node node);

    /**树形节点展示节点*/
    protected void tree(int space){
        for (int i=0;i<space;i++){
            System.out.print(" ");
        }
        System.out.println(name);
    }

    protected void tree(){
        this.tree(0);
    }
}
