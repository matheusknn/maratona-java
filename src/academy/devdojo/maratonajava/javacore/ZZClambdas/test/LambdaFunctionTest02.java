package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaFunctionTest02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Matheus", "Kenji", "Nishimura");
        List<Integer> integers = map(nomes, String::length); //method refrence


    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e: list) {
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
