package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("salário: " + this.salario);
    }

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void relatorioPagamento() {
        System.out.println("Funcionário: " + this.nome + " recebo o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
