package mode.行为.模板方法;

/**
 * 瀑布模型项目管理类分别声明了项目管理周期中各阶段的分步抽象方法，其中包括需求分析analyze()、软件设计design()、代码开发develop()、质量测试test()、上线发布release()。
 * 这些步骤的实现统统由子类去自由发挥，例如第9行的质量测试方法test()，子类可以进行人工测试，也可以实现自动化测试，此处不必关心这些实现细节。站在项目管理的角度来看，
 * 抽象类应该关注的是对大局的操控，把控项目进度，避免造成资源浪费，譬如程序员在没有确立技术框架的情况下就进行代码开发，难免会引入不必要的工作量，可见模板方法的重要性
 */
public abstract class PM {
    public abstract String analyze();//需求分析

    public abstract String design(String project);//软件设计

    public abstract String develop(String project);//代码开发

    public abstract boolean test(String project);//质量测试

    public abstract void release(String project);//上线发布

    protected final void kickoff() {
        String requirement = analyze();
        String designCode = design(requirement);
        do {
            designCode = develop(designCode);
        } while (!test(designCode));//如果测试失败则需修改代码
        release(designCode);
    }

}
