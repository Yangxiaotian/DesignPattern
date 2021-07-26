package cn.viewshine.pizza.correct;

import cn.viewshine.pizza.simple.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("Greek")) {
            pizza = new GreekPizza();
        } else if(type.equals("Plam")) {
            pizza = new PlamPizza();
        } else if(type.equals("Veggie")) {
            pizza = new VeggiePizza();
        } else if(type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }
        pizza.perpare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
