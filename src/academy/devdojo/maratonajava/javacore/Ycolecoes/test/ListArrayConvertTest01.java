package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);//0 descobre o tamanho do array sozinho
        System.out.println(Arrays.toString(listToArray));

        System.out.println("----------------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //método cria um link com o array original

        System.out.println("--------------------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));//não fica link
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List.of(11, 34);
    }
}
