package mode.行为.访问者;

import java.time.LocalDate;

public class Candy extends Product implements Acceptable{
    public Candy(String name, LocalDate producedDate, float price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
