package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim  = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));

        inicio = System.currentTimeMillis();
        stringBuilder(100000);
        fim  = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
    }
    
    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void stringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void stringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

}
