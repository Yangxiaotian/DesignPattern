package cn.viewshine.duck.simple2;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        System.out.println("看起来是橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱");
    }
}
