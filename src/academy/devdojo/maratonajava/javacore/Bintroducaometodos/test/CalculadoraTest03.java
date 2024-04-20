package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 56;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);//faz cópia de num1 e num2, e não altera as originais
        System.out.println(num1);
        System.out.println(num2);
    }
}
