package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTes01 {
    public static void main(String[] args) {
        //FORMAS DE PASSAR O PATH DE UM ARQUIVO
        Path p1 = Paths.get("D:\\Users\\MATHEUS\\Desktop\\maratona-java1\\file.txt");
        System.out.println(p1.getFileName()); //retorna o nome do arquivo nessa path
        Path p2 = Paths.get("D:\\Users\\MATHEUS\\Desktop\\maratona-java1","file.txt");
        Path p3 = Paths.get("D:","\\Users\\MATHEUS\\Desktop\\maratona-java1","file.txt");
        Path p4 = Paths.get("D:","Users", "MATHEUS", "Desktop", "maratona-java1","file.txt");

        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
