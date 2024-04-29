package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDirCreated = fileDiretorio.mkdir(); //cria um diretório e retorna um boolean
        System.out.println(isDirCreated);

        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt"); //fileDiretório tem a referência para o diretório pasta
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txr");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDirRenamed = fileDiretorio.renameTo(diretorioRenamed);
    }
}
