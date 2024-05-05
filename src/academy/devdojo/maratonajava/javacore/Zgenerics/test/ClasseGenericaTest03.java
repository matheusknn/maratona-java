package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
       List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
       List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedez")));

       RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
       Carro carro = rentalService.retornarObjetoDisponivel();
       System.out.println(carro + " alugado");

        System.out.println(carrosDisponiveis);
       rentalService.devolverObjetoAlugado(carro);

        System.out.println(carrosDisponiveis);
    }
}
