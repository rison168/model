package decorator;

/**
 * @author Rison_Lee on 2020/7/29 9:09.
 * @version 1.0
 */
public class MainClass {
    public static void main(String[] args) {
//        Car flyCar = new FlyCar();
//        flyCar.show();

//        Car flyCar = new RunCar();
//        CarDecorator carDecorator = new FlyCarDecorator(flyCar);
//        carDecorator.show();

        Car car = new RunCar();
        CarDecorator flyCarDecorator = new FlyCarDecorator(car);
        CarDecorator swimCarDecorator = new SwimCarDecorator(flyCarDecorator);
        swimCarDecorator.show();
    }
}
