package mode.行为.责任链;

/**
 * 责任链是由很多责任节点串联起来的一条任务链条，其中每一个
 * 责任节点都是一个业务处理环节。责任链模式（Chain of
 * Responsibility）允许业务请求者将责任链视为一个整体并对其发起
 * 请求，而不必关心链条内部具体的业务逻辑与流程走向
 *
 * 案例：工作流（报销工作流）
 */
public class Client {
    /**
     * 假设某公 司的报销审批流程有3个审批角色，分别是财务专员（1 000元审批权限）、财务经理（5 000元审批权限）以及财务总监（10 000元审批权限）
     *
     * 审批人的业务之间有环环相扣的关联，对于超出审批人职权范围的申请会传
     * 递给上级，直到解决问题为止。这种传递机制就需要我们搭建一个链式结构的工作流
     * @param args
     */
    public static void main(String[] args) {
        Approver flightJohn = new Staff("张飞");
        //此处使用链式编程配置责任链
        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

        //直接找专员张飞审批
        flightJohn.approve(1000);
        /***********************
         审批通过。【专员：张飞】
         ***********************/

        flightJohn.approve(4000);
        /***********************
         无权审批，升级处理。【专员：张飞】
         审批通过。【经理：关羽】
         ***********************/

        flightJohn.approve(9000);
        /***********************
         无权审批，升级处理。【专员：张飞】
         无权审批，升级处理。【经理：关羽】
         审批通过。【CEO：刘备】
         ***********************/

        flightJohn.approve(88000);
        /***********************
         无权审批，升级处理。【专员：张飞】
         无权审批，升级处理。【经理：关羽】
         驳回申请。【CEO：刘备】
         ***********************/
    }
}
