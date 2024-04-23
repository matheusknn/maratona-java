package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(23,0));
        //sout não pega pois a exceção foi lançada na linha de cima
        System.out.println("depois da exceção ser lançada");
    }

    private static int divisao(int a, int b) {
        if( b == 0) {
            throw new IllegalArgumentException("o segundo argumento da função \"divisao\" não pode ser 0");
        }
        return a/b;
    }
}
