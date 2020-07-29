package decorator;

/**
 * @author Rison_Lee on 2020/7/29 9:12.
 * @version 1.0
 */
public class FlyCar implements Car{
    public void show() {
        this.run();
        this.fly();
    }

    public void run() {
        System.out.println("可以跑");
    }
    public void fly(){
        System.out.println("可以飞");
    }

}
