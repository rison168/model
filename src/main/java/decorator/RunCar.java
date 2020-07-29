package decorator;

/**
 * @author Rison_Lee on 2020/7/29 9:12.
 * @version 1.0
 */
public class RunCar implements Car{
    public void show() {
        this.run();
    }
    public void run() {
        System.out.println("可以跑");
    }
}
