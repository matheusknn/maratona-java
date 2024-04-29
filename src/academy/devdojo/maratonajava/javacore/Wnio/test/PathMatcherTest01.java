package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3= Paths.get("pasta/subpasta/file.java");

        matches(path, "glob:**.bkp");
        matches(path, "glob:**/*.bkp");
        matches(path, "glob:**/*.{bkp,java,txt}");
        matches(path, "glob:**/*.???");//arquivo procurado deve ter 3 letas ???

    }

    private static void matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}
