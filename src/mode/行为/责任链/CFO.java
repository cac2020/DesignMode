package mode.行为.责任链;

public class CFO extends Approver {
    public CFO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过。【财务总监：" + name + "】");
        } else {
            System.out.println("驳回申请。【财务总监：" + name + "】");
        }
    }
}
