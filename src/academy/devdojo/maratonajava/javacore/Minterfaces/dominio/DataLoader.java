package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
//   todo metodo em uma interface é public e abstract por trás dos panos
    void load();
    default void checkPermission() { // método com implementação padrão a todos as classes que implementam
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSizeInterface");
    }


}
