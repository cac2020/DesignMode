package mode.行为.策略;

public class Camera implements USB {
    @Override
    public void read() {
        System.out.println("视频流数据……");
    }
}
