package mode.创建.建造者;

/**
 * 施工方接口
 * 拥有各项施工方法
 */
public interface Builder {
    public void buildBasement();
    public void buildWall();
    public void buildRoof();
    public Building getBuilding();
}
