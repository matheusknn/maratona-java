package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("yellow", 1998), new Car("Black", 2011), new Car("Green", 1999));

    private static List<Car> filterGreenCar(List<Car> cars, String color) {
        List<Car> filteredCarsByColor = new ArrayList<>();
        for (Car car : cars) {
            if(car.getColor().equalsIgnoreCase(color)) {
                filteredCarsByColor.add(car);
            }
        }
        return filteredCarsByColor;
    }

    private static List<Car> filterCarsByYear(List<Car> cars, int year) {
        List<Car> filteredCarsByYear = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() >= year) {
                filteredCarsByYear.add(car);
            }
        }
        return filteredCarsByYear;
    }
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars, "green"));
        System.out.println(filterGreenCar(cars, "yellow"));

        System.out.println(filterCarsByYear(cars, 1999));
    }
}
