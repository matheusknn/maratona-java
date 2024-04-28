package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);){ //true para adicionar a próxima linha e não reescrever todo o arquivo
            fw.write("Matheus Kenji Nishimura, é certamente uma pessoa\n tesxtezinho");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
