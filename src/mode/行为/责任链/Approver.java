package mode.行为.责任链;

/**
 * 审批人的业务之间有环环相扣的关联，对于超出审批人职权范围的申请会传递给上级，直到解决问题为止。这种传递机制就需要我们搭建一个链式结构的工作流
 */
public abstract class Approver {
    // 抽象出审批人的姓名
    protected String name;
    // 下一位审批人，更高级别领导
    protected Approver nextApprover;
    public Approver(String name){
        this.name = name;
    }
    public Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;
    }

    public abstract void approve(int amount);// 抽象审批方法由具体审批人子类实现
}
