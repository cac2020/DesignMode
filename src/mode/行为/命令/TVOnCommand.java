package mode.行为.命令;

public class TVOnCommand implements Command {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.on();
    }

    @Override
    public void unexe() {
        tv.off();
    }
}
