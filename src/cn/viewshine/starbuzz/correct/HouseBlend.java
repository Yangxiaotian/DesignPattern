package cn.viewshine.starbuzz.correct;

import cn.viewshine.starbuzz.correct.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend";
    }
    @Override
    public float cost() {
        return .89f;
    }
}
