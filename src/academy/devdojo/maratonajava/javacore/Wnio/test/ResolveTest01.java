package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/matheus");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolvePath = dir.resolve(arquivo); //junta os paths
        System.out.println(resolvePath);

        Path absoluto = Paths.get("/home/william");
        Path relativo = Paths.get("home/william");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto));
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto)); //caminho absoluto não muda pois é absoluto
        System.out.println("6 " + file.resolve(relativo));
    }
}
