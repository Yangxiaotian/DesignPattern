package cn.viewshine.starbuzz.correct;

public class Whip extends CondimentDecorator{
    private Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+.1f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
