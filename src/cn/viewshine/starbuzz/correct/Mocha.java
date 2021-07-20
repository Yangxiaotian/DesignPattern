package cn.viewshine.starbuzz.correct;

public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+.2f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
