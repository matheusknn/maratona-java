package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Gamer", 20000);
        Tomate tomate = new Tomate("Tomatasso", 10);
        Televisao tv = new Televisao("50'", 4000);
        CalculadoraImposto.calcularImpostoProdutos(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImpostoProdutos(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImpostoProdutos(tv);
    }
}
