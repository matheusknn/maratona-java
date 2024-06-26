package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("17690-000");

        Pessoa pessoa = new Pessoa("Matheus");
        pessoa.setCpf("23507229907");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Cleiton", 2398.98);
        System.out.println("--------------------------------");
        funcionario.setCpf("23456-3435");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
