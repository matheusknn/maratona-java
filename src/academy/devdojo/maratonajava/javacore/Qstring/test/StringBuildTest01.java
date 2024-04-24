package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuildTest01 {
    public static void main(String[] args) {
        String nome = "Matheus Kenji";
        nome.concat( "Nishimura");//retorna nova string
        nome.substring(0, 3);
        System.out.println(nome);//Matheus Kenji

        //permite realizar a mudança direta da string sem precisar realocar ela na pool de strings
        StringBuilder sb = new StringBuilder("Matheus Kenji");//16 caracteres por padrão de
        sb.append(" Nishimura").append(" Pessoa"); //método para concatenar string builders
        String substring = sb.substring(0, 2);
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
        System.out.println(substring);
    }
}
