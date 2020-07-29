package decorator;

import lombok.Data;

/**
 * @author Rison_Lee on 2020/7/29 9:23.
 * @version 1.0
 */
@Data
public abstract class CarDecorator implements Car{
    private Car car;
    public CarDecorator(Car car){
        this.car = car;
    }
    public abstract void show();
}
