package academy.devdojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorstatic.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Lancer", 180);
        Carro.setVelocidadeLimite(256);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
