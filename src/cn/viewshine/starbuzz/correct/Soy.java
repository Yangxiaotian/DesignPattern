package cn.viewshine.starbuzz.correct;

public class Soy extends CondimentDecorator{
    private Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public int getSize() {
        return beverage.getSize();
    }
    @Override
    public float cost() {
        float cost = beverage.cost()+.15f;
        int size = getSize();
        if (size == Beverage.TALL) {
            cost += .1f;
        } else if (size == Beverage.GRANDE) {
            cost += .15f;
        } else if (size == Beverage.VENTI) {
            cost += .20f;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
