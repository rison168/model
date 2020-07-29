package decorator;

/**
 * @author Rison_Lee on 2020/7/29 9:26.
 * @version 1.0
 */
public class FlyCarDecorator extends CarDecorator{
    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().run();
        this.fly();
    }

    public void fly(){
        System.out.println("可以飞");
    }

}
