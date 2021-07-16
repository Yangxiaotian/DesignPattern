package cn.viewshine.duck.correct;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("吱吱");
    }
}
