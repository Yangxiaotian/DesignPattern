package cn.viewshine.starbuzz.simple2;

public class Beverage {
    private String description;
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;
    public String getDescription() {
        return description;
    }
    public boolean hasMilk() {
        return milk;
    }
    public boolean hasSoy() {
        return soy;
    }
    public boolean hasMocha() {
        return mocha;
    }
    public boolean hasWhip() {
        return whip;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public void setSoy(boolean soy) {
        this.soy = soy;
    }
    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }
    public void setWhip(boolean whip) {
        this.whip = whip;
    }
}
