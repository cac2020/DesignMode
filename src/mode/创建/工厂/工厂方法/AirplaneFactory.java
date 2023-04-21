package mode.创建.工厂.工厂方法;

import java.util.Random;

public class AirplaneFactory implements Factory {
    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random();
        int x = random.nextInt(screenWidth);
        return new Airplane(x,0);
    }
}
