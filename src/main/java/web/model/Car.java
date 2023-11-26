package web.model;

import java.util.Objects;

public class Car {
    private final String model;
    private final String country;
    private final Integer enginePower;

    public Car(String model, String country, Integer enginePower) {
        this.model = model;
        this.country = country;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(country, car.country) && Objects.equals(enginePower, car.enginePower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, country, enginePower);
    }


    @Override
    public String toString() {
        return "Car: model: " + model + ", country: " + country + ", enginePower: " + enginePower;
    }

}
