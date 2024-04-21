package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String categoria;
    private int episodios;
    private String genero;

    public Anime(String nome) {
        this.nome = nome;
    }

    public void init(String nome, String categoria, int episodios) {
        this.nome = nome;
        this.categoria = categoria;
        this.episodios = episodios;
    }

    public void init(String nome, String categoria, int episodios, String genero) {
        this.init(nome, categoria, episodios);
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
