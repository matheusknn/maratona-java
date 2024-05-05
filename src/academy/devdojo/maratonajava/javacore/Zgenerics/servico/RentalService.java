package academy.devdojo.maratonajava.javacore.Zgenerics.servico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T retornarObjetoDisponivel() {
        System.out.println("Buscando objeto disponível");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto " + t );

        System.out.println("Objetos disponíveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void devolverObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);

        System.out.println("Objeto devolvido com sucesso");
        System.out.println("Objetos disponíveis: " + objetosDisponiveis);
    }
}
