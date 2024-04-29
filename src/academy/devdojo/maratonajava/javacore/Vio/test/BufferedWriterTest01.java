package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 { //usada para escrita nos arquivos
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);){ //true para adicionar a próxima linha e não reescrever todo o arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Matheus Kenji Nishimura, é certamente uma pessoa tesxtezinho");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
