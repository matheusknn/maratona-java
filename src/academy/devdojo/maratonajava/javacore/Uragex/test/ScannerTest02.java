package academy.devdojo.maratonajava.javacore.Uragex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,Armin,true,200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");

        System.out.println(scanner);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int " + i);
            } else if(scanner.hasNextBoolean()) {
                boolean boolean1 = scanner.nextBoolean();
                System.out.println("Boolean " + boolean1);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
