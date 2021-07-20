package cn.viewshine.starbuzz.correct;

public class Soy extends CondimentDecorator{
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+.15f;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
