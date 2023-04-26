package mode.行为.命令;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.off();
    }

    @Override
    public void unexe() {
        tv.on();
    }
}
