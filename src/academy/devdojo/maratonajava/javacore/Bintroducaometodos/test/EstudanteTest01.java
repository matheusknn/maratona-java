package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.idade = 23;
        estudante1.nome = "Hamada";
        estudante1.sexo = 'M';

        impressora.imprime(estudante1);

        System.out.println("\n");

        estudante2.idade = 28;
        estudante2.nome = "Gintoki";
        estudante2.sexo = 'M';

        impressora.imprime(estudante2); //passando objeto altera o objeto real, pois é a cópia do endereço de memória
        System.out.println(estudante2.nome);
    }
}
