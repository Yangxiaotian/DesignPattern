package cn.viewshine.starbuzz.correct;

public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf";
    }
    @Override
    public float cost() {
        return 1.05f;
    }
}
