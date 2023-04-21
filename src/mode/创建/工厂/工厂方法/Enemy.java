package mode.创建.工厂.工厂方法;

public abstract class Enemy {
    //敌人x y坐标
    protected int x;
    protected int y;

    public Enemy(int x,int y){
        this.x = x;
        this.y = y;
    }
    //具体的展示方式  根据子类情况不同进行个性化展示
    protected abstract void show();
}
