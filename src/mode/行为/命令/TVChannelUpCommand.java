package mode.行为.命令;

public class TVChannelUpCommand implements Command {
    private TV tv;

    public TVChannelUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.channelUp();
    }

    @Override
    public void unexe() {
        tv.channelDown();
    }
}
