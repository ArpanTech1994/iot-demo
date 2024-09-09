package decorators;

import interfaces.Car;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.print("Adding features of Sports Car");
    }
}
