package cn.viewshine.duck.simple2;

public class RedheadDuck extends Duck implements Flyable, Quackable{

    @Override
    public void display() {
        System.out.println("看起来是红头");
    }

    @Override
    public void fly() {
        System.out.println("飞翔");
    }

    @Override
    public void quack() {
        System.out.println("嘎嘎");
    }
}
