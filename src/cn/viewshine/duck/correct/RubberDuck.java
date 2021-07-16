package cn.viewshine.duck.correct;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("外观是橡皮鸭");
    }
}
