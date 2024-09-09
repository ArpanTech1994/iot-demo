package decorators;

import interfaces.Car;
public class BasicCar implements Car {
    @Override
    public void drive() {
        System.out.print("Basic Car with no extra features");
    }
}
