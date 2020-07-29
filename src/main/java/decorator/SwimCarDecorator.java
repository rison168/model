package decorator;

/**
 * @author Rison_Lee on 2020/7/29 9:26.
 * @version 1.0
 */
public class SwimCarDecorator extends CarDecorator{
    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    public void run() {
    }

    public void swim(){
        System.out.println("可以游");
    }

}
