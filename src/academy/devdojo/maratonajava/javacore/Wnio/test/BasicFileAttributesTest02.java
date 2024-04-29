package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasts2/novo_path.txt2");
        Files.createFile(path);
        BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = bfa.creationTime();
        FileTime lastModifiedTime = bfa.lastModifiedTime();
        FileTime lastAccessTime = bfa.lastAccessTime();

        System.out.println(" cretionTime " + creationTime);//tempo UTC - greenwich
        System.out.println(" lasModifiedTime " + lastModifiedTime);
        System.out.println(" lastAccessTime " + lastAccessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime ,creationTime);
    }
}
