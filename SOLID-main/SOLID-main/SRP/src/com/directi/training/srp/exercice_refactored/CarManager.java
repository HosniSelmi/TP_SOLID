package com.directi.training.srp.exercice_refactored;

import java.util.List;

public class CarManager {
    private CarDatabase carDatabase;
    private CarFormatter carFormatter;

    public CarManager(CarDatabase carDatabase, CarFormatter carFormatter) {
        this.carDatabase = carDatabase;
        this.carFormatter = carFormatter;
    }

    public Car getCarFromDb(final String carId) {
        return carDatabase.getFromDb(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carDatabase.getAllCars();
        return carFormatter.formatCarNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carDatabase.getAllCars();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
