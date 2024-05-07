package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumerTest01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Matheus", "Kenji", "Nishimura");
        forEach(nomes, (String s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
