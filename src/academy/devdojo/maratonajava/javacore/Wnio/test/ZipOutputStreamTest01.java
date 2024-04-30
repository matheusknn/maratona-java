package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZiparPath = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivosParaZiparPath);
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
            for (Path file : directoryStream) {
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
            System.out.println("arquivo criado com sucesso!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
