package mode.创建.工厂.简单工厂;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
/**
 * 简单工厂
 * 将创建对象的逻辑从客户端分离出来放到工厂里
 * 适用场景：创建对象逻辑简单不复杂 没有复杂的初始化逻辑；如果复杂，那么简单工厂就会变得逻辑耦合 这时候就得需要工厂方法了
 *
 */
public class SimpleFactory {
    private int screenWidth;
    private Random random;
    public SimpleFactory(int screenWidth){
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    /**
     * 通过Switch 跳转生成不同子类
     * @param type
     * @return
     */
    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy = null;
        switch (type){
            case "AirPlane":
                enemy = new AirPlane(x,0);
                break;
            case "Tank":
                enemy = new Tank(x,0);
                break;
        }
        return enemy;
    }

    /**
     * 通过反射创建不同的子类
     * @param type
     * @return
     */
    public Enemy create2(String className) {
        Enemy enemy = null;
        int x = random.nextInt(screenWidth);
        //反射获取指定类
        Class<?> aClass = null;
        Constructor<?> constructor = null;
        try {
            aClass = Class.forName(className);
            //获取指定类的指定参数的构造器
            constructor = aClass.getConstructor(int.class, int.class);
            //使用构造器创建对象
            if (constructor != null){
                enemy = (Enemy) constructor.newInstance(x, 0);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return enemy;
    }
}
