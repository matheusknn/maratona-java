package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Matheus Kenji", "123" );
//        serializar(aluno);
        desserializar();
    }

    private static void serializar(Aluno aluno) { //serializar = tranformar um objeto em um array de bytes
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desserializar() { //serializar = tranformar um objeto em um array de bytes
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream objectinputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) objectinputStream.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
