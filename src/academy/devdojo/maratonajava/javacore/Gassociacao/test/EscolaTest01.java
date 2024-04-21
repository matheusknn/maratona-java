package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Délcio");
        Escola escola = new Escola("Single");
        Professor[] professores = {professor1};
        escola.setProfessores(professores);
        escola.imprime();
    }
}
