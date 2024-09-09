package decorators;

import interfaces.Car;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.print("Adding features of Luxury Car");
    }
}
