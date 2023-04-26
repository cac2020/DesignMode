package mode.行为.命令;


public class Switcher {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    // 按钮事件绑定
    public void buttonPush() {
        System.out.println("按下按钮……");
        command.exe();
    }

    public void buttonPop() {
        System.out.println("弹起按钮……");
        command.unexe();
    }

}
