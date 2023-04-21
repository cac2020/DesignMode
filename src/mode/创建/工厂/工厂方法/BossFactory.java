package mode.创建.工厂.工厂方法;


public class BossFactory implements Factory {
    /**
     * Boss有自己个性化的初始化逻辑
     * @param screenWidth
     * @return
     */
    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth/2,0);
    }
}
