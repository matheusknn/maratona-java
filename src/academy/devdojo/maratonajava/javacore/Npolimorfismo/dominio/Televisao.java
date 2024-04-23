package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

import java.sql.SQLOutput;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.30;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * this.IMPOSTO;
    }
}
