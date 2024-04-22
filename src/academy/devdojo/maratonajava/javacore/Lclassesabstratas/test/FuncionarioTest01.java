package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Carlão", 3000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Keni", 2000);
        desenvolvedor1.calcularBonus(desenvolvedor1.getSalario());
        System.out.println(desenvolvedor1);
        System.out.println(gerente1);
        gerente1.imprime();
        desenvolvedor1.imprime();
    }
}
