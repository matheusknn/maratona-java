package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.ArrayList;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Roberto";
        funcionario.idade = 23;
        funcionario.salarios = new double[] {12, 23, 34};

        funcionario.mostrarDadosFuncionario();
        System.out.println(funcionario.calcularMediaDoSalario());
    }
}
