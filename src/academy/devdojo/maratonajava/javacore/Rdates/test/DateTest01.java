package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data = new Date(100000000L);//retorna um long que equivale a determinado dia começando de 1 de 1970
        System.out.println(data);
        System.out.println(data.getTime());

    }
}
