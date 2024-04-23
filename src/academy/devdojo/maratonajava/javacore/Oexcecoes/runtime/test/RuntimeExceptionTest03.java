package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abringo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally { //bloco que é executado independente de ter exceção ou não
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

}
