package mode.行为.观察者;

public class PhoneFans extends Buyer {
    public PhoneFans(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        //此买家只购买手机
        if(product.contains("手机")){
            System.out.print(name);
            System.out.println("购买：" + product);
        }
    }
}
