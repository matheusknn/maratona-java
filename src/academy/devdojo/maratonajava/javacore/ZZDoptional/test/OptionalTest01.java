package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("testetsasdd"); //Optional.of exige que o valor de parâmetro não seja nulo
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();//criando um optional vazio

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------------");

        Optional<String> nameOptional = findName("Kenji");
        String empty = nameOptional.orElse("empty");//retorna o valor da string se ela existir e se ela não existir retorna o que foi colocado de argumento
        System.out.println(nameOptional);
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));//se existir um conteúdo no optional faça:
    }

    private static Optional<String> findName(String name) {
        List<String> nomes = List.of("Matheus", "Kenji");
        int i = nomes.indexOf(name);
        if(i != -1) {
            return Optional.of(nomes.get(i));
        }
        return Optional.empty();
    }
}
