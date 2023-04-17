package com.exerciciosjava.devdojo.javacore.Oexcecption.exception.test;

import com.exerciciosjava.devdojo.javacore.Oexcecption.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 { //Exceção customizada
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.print("Usuário: ");
        String usernameDigitado = scanner.next();
        System.out.print("Senha: ");
        String senhaDigitada = scanner.next();

        if (!usernameDB.equals(usernameDigitado) | !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou senha inválidos");//Por ser uma exceção do tipo checked, precisa declarar na assinatura do método
        }

        System.out.println("Usuário logado com sucesso");
    }
}
