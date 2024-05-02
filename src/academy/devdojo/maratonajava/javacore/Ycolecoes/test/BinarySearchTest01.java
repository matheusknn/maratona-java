package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(2);
        inteiros.add(0);
        inteiros.add(4);
        inteiros.add(8);
        //(-(ponto de inserção) -1)
        //index 0,1,2,3
        //value 0,2,4,8
        Collections.sort(inteiros);
        System.out.println(Collections.binarySearch(inteiros, 2));
    }
}
