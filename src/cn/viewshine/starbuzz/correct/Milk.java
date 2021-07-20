package cn.viewshine.starbuzz.correct;

public class Milk extends CondimentDecorator{
    private Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.description + ", Milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + .1f;
    }
}
