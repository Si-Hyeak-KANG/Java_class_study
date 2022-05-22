package optional.optionalobject.entity;

import java.util.Optional;

public class Member {

    String name;
    String id;
    Optional<Car> car;

    public Member(String name, String id, Optional<Car> car) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Optional<Car> getCar() {
        return car;
    }
}
