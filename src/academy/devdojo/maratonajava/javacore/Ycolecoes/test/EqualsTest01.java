package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        String name = "Matheus Kenji";
        String name2 = "Matheus Kenji";
        System.out.println(name == name2); //true, pois as duas variáveis fazem ref a String na pool de strings

        String name3 = new String("Matheus Kenji");//fica no heap
        System.out.println(name == name3);//false, pois o new faz o objeto criado ir para o heap


        System.out.println(name.equals(name3));//compara o conteúdo das Strings para comparar e não a referência


        System.out.println("-------------------------------------------------");


        Smartphone smartphone1 = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(smartphone1.equals(smartphone2));//false - equals do object verifica se a variável de referência de smartphone 1 faz a mesma referêmcia para o smartphone2


        smartphone2 = smartphone1;
        System.out.println("Mesma referência: " + smartphone1.equals(smartphone2));//true





    }
}
