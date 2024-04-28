package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");//criando objeto file
        File file2 = new File("D:\\Users\\MATHEUS\\Desktop\\maratona-java1\\arquivo");

        try {
            boolean isCreated= file.createNewFile(); //criando um novo arquivo no projeto
            System.out.println(isCreated);
            System.out.println("path " + file.getAbsolutePath());
            boolean fileExists = file.exists(); //verificando se o arquivo existe
            if (fileExists) {
                boolean delete = file.delete();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
