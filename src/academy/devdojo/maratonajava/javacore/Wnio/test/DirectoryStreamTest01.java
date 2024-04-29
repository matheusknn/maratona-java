package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {//listar arquivos de um diretório
    public static void main(String[] args) {
        Path dirPath = Paths.get("pasta");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath)){
            for (Path path: stream) {
                System.out.println(path.getFileName());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
