package cn.viewshine.duck.simple;

public abstract class Duck {
    public void quack() {
        System.out.println("嘎嘎");
    }
    public void swim() {
        System.out.println("在游泳");
    }
    public void fly() {
        System.out.println("飞翔");
    }
    public abstract void display();
}
