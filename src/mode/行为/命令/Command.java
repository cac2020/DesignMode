package mode.行为.命令;

public interface Command {
    //执行命令
    void exe();

    //反向执行命令
    void unexe();
}
