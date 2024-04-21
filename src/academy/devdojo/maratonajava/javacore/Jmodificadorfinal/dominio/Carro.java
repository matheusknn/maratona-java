package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro { //classe final não pode ser extendida
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //final quer dizer que é constante e não poderá ser alterada
    public final Comprador COMPRADOR = new Comprador(); //referência nunca pode ser alterada

    public final void imprime() { //método final não pode ser sobrescrito
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
