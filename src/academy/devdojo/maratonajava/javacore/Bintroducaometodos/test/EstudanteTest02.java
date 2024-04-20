package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Cleiton";
        estudante.sexo = 'M';
        estudante.idade = 23;

        estudante.imprime();
    }
}
