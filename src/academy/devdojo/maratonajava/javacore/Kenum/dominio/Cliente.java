package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;
    private TipoDeCliente tipoDeCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoDeCliente tipoDeCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoDeCliente = tipoDeCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoDeCliente=" + tipoDeCliente +
                ", tipoDeClienteInt=" + tipoDeCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
