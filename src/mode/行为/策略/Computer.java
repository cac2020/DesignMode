package mode.行为.策略;

/**
 * 计算机
 */
public class Computer {
    private USB usb;//主机上的USB接口

    public void setUsb(USB usb) {
        this.usb = usb;//插入USB设备
    }

    public void compute(){
        usb.read();
    }
}
