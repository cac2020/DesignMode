package mode.行为.命令;
/**
 * 开关命令
 */
public class SwitchCommand implements Command {
    private Bulb bulb;

    public SwitchCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unexe() {
        bulb.off();
    }
}
