package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Miata;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(carro.COMPRADOR);
        System.out.println(carro2.COMPRADOR);
        System.out.println(Carro.VELOCIDADE_LIMITE);

        Miata miata = new Miata();
        miata.setNome("miatinha");
        miata.imprime();
    }
}
