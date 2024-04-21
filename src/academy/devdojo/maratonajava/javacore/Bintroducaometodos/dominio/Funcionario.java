package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void mostrarDadosFuncionario() {
        System.out.println("nome " + this.nome);
        System.out.println("idade " + this.idade);
    }

    public double calcularMediaDoSalario() {
        double totalSalario = 0;
        double mediaSalarios = 0;
        for (double salario: this.salarios) {
            totalSalario += salario;
        }
        mediaSalarios = totalSalario/this.salarios.length;
        return mediaSalarios;
    }
}
