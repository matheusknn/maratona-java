package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{ //classe abstrata =  que deve ser extendida por outra classe
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus(this.salario);
    }

    public abstract void calcularBonus(double salario);

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
