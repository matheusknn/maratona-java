package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Yoru", "Jet", "Cagaya"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> numstringToInteger = Integer::parseInt;
        System.out.println(numstringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkname = List::contains;
        System.out.println(checkname.test(nomes, "Yoru"));
    }
}
