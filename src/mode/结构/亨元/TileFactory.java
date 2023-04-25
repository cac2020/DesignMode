package mode.结构.亨元;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class TileFactory {
    /**
     * 图库缓存
     */
    private Map<String,Drawable> images;
    public TileFactory(){
        this.images = new HashMap<>();
    }

    /**
     * 从图件工厂中获取图件 首次获取需要创建 以后获取就从缓存取 达到了共享的目的
     * @param image
     * @return
     */
    public Drawable getDrawable(String image) {
        //缓存池里如果没有图件，则实例化并放入缓存池
        if(!images.containsKey(image)){
            switch (image) {
                case "河流":
                    images.put(image, new River());
                    break;
                case "草地":
                    images.put(image, new Grass());
                    break;
                case "道路":
                    images.put(image, new Road());
                    break;
                case "房屋":
                    images.put(image, new House());
                    break;
            }
        }
        return images.get(image);
    }

}
