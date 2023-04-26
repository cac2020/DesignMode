package mode.行为.命令;

/**
 * 霓虹灯闪烁命令
 */
public class FlashCommand implements Command {
    private Bulb bulb;
    private volatile boolean neonRun = false;// 闪烁命令运行状态

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!neonRun) {// 非命令运行时才能启动闪烁线程
            neonRun = true;
            System.out.println("霓虹灯闪烁任务启动");
            new Thread(() -> {
                try {
                    while (neonRun) {
                        bulb.on();// 执行开灯操作
                        Thread.sleep(500);
                        bulb.off();// 执行关灯操作
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    @Override
    public void unexe() {
        neonRun = false;
        System.out.println("霓虹灯闪烁任务结束");
    }
}
