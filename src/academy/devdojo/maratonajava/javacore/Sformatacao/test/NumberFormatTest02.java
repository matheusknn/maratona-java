package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[3];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance((localeJp));
        nf[2] = NumberFormat.getCurrencyInstance((localeIt));

        double valor = 10000.2130;

        for (NumberFormat numberFormat : nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "R$ 10.000,21";
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
