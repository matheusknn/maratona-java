package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("yellow", 1998), new Car("Black", 2011), new Car("Green", 1999));

    public static void main(String[] args) {
//        List<Car> greeCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equalsIgnoreCase("green");
//            }
//        });

        List<Car> greeCars = filter(cars, car -> car.getColor().equalsIgnoreCase("green"));
        System.out.println(greeCars);
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if(carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


}
