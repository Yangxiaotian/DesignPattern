package cn.viewshine.duck.correct;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("没有任何声音");
    }
}
