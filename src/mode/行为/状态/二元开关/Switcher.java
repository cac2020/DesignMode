package mode.行为.状态.二元开关;

/**
 * 开 关
 */
public class Switcher {
    //false代表关闭， true代表开启
    boolean state = false;//初始状态为关闭

    public void switchOn(){
        if(state == false){//若当前为关闭状态
            state = true;
            System.out.println("OK...使灯亮");
        }else{//当前已经是开启状态
            System.out.println("ERROR!!!开启状态下无须再开启");
        }
    }

    public void switchOff() {
        if (state == true) {//若当前是开启状态
            state = false;
            System.out.println("OK...使灯灭");
        } else {//当前已经是关闭状态
            System.out.println("ERROR!!!关闭状态下无须再关闭");
        }
    }

}
