package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Going Merry"));
        criarArrayComUmObjeto(new Carro("Miatinha"));

        List<Aluno> alunoList = retornarListaDeUmObjeto(new Aluno(2323L, "Cesar", "123456"));
        System.out.println(alunoList);
    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }

    private static <T> List<T> retornarListaDeUmObjeto(T t) {
        List<T> lista = List.of(t);
        return lista;
    }

    private static <T extends Comparable<T>> List<T> retornarListaDeUmObjetoQueImplementaComparable(T t) {
        List<T> list = List.of(t);
        return list;
    }
}

