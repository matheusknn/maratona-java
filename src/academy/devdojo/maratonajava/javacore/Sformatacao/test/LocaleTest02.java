package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //pega o local de configuração do pc
        String[] isoCountries = Locale.getISOCountries();
        for (String pais: isoCountries) {
            System.out.println(pais);
        }
    }
}
