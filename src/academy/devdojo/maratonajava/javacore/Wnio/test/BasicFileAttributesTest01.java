package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(10);
        File file = new File("pasts2/novo.txt");

        if (file.exists()) {
            boolean isCreated = file.createNewFile();
        }
        boolean isModified = file.setLastModified(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());

        System.out.println("--------forma novo de alterar a data de alteração de um arquivo---------");
        Path path = Paths.get("pasts2/novo_path.txt");
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        FileTime fileTime = FileTime.from(localDateTime.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
    }
}
