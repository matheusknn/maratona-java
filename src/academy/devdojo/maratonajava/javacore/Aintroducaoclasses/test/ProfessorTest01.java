package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 46;
        professor.sexo = 'M';
        professor.nome = "Martins";

        System.out.println("nome: " + professor.nome + " \nidade: " + professor.idade + " \nsexo: " + professor.sexo);
    }
}
