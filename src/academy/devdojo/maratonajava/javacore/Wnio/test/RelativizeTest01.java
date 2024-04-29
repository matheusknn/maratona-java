package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        //relativar um diretório path 
        Path dir = Paths.get("/home/matheus");
        Path clazz = Paths.get("/home/matheus/dev/olamundo.java");
        Path pathToClazz = dir.relativize(clazz); //retorna o caminho para achar o arquivo/pasta passado de argumento
        System.out.println(pathToClazz);


        Path absoluto1 = Paths.get("/home/matheus");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/matheus/dev/olamundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2012921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        System.out.println("5 " + absoluto1.relativize(relativo1));
    }
}
