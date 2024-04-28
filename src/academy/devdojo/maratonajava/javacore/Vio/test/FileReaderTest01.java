package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
            int i = 0;
            while ((i = fr.read()) != -1) { //i vai recevendo o valor asc de determinada posição
                System.out.print((char) i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
