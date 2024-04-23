package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDb = "goku";
        String senhaDb = "super";
        String usernameDigitado;
        String senhaDigitada;

        System.out.println("Username");
        usernameDigitado = scanner.nextLine();
        System.out.println("Senha");
        senhaDigitada = scanner.nextLine();
        if(!usernameDb.equals(usernameDigitado) || !senhaDigitada.equals(senhaDb)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");

    }
}
