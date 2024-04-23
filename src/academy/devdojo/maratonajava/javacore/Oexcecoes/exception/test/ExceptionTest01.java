package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {
        ExceptionTest01.criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }
}
