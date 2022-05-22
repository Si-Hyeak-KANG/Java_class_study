package optional.optionalobject.entity;

import java.util.Optional;

public class Car {

    String carName;
    int price;
    Optional<Insurance> insurance;

    public Car(String carName, int price, Optional<Insurance> insurance) {
        this.carName = carName;
        this.price = price;
        this.insurance = insurance;
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
