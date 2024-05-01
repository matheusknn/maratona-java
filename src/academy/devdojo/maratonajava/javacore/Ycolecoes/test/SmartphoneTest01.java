package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("1C234", "Xiomi");
        Smartphone smartphone3 = new Smartphone("1C232", "Samsumg");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

//        smartphones.clear();//deleta todo arrayList
        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        Smartphone smartphone4 = new Smartphone("1C232", "Samsumg");
        System.out.println(smartphones.contains(smartphone4)); //verifica se o s4 entá presente na lista pelo equals
        System.out.println(smartphones.indexOf(smartphone1)); //retorna o índice do objeto na lista e caso não exista ele retorna -1
    }
}
