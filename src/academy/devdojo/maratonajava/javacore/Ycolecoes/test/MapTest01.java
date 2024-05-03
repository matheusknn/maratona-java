package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//ordena pelo HashCode
        Map<String, String> map2 = new LinkedHashMap<>();//mantém a ordem de inserção
        map.put("teclado", "logitech c6 pró");
        map.put("mouse", "redDragon pcl");
        //OBS: caso a chave já exista dentro do map o valor da chave é sobrescrito quando tentamos adicionar usando o método put
        map.putIfAbsent("Capa", "freefire");//adiciona apenas se a chave não existir dentro do map
        System.out.println(map);

        for(String key: map.keySet()) { //retorna um set com todas as chaves desse map
            System.out.println("Chave: " + key + " -Valor: " + map.get(key));
        }

        System.out.println("----------------------------------");
        for(String valueMap: map.values()) { //retorna todos os valores do map
            System.out.println(valueMap);
        }

        System.out.println("-----------------------------");
        for (Map.Entry<String, String> entry: map.entrySet()) { //retorna um objeto com acesso as chaves e valores do map em cada iteração
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
