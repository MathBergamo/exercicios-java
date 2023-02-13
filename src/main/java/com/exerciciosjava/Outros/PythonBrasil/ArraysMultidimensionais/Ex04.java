package com.exerciciosjava.Outros.PythonBrasil.ArraysMultidimensionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] compromissos = new String[30][24];

        boolean sair = false;
        int dia = 0, hora = 0;

        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Entre com o dia do mês: ");
                boolean diaValido = false;

                while (!diaValido) {
                    dia = scanner.nextInt();
                    if (dia > 0 && dia < 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido!\nDigite um dia do mês (1 a 30)");
                    }
                }

                System.out.println("Entre com a hora: ");
                boolean horaValida = false;
                while (!horaValida) {
                    hora = scanner.nextInt();
                    if (hora > 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida!\nDigite uma hora do mês (1 a 24)");
                    }
                }

                System.out.println("Digite o compromisso: ");
                compromissos[dia][hora] = scanner.next();

            } else if (opcao == 2) {
                System.out.println("Entre com o dia do mês: ");
                boolean diaValido = false;

                while (!diaValido) {
                    dia = scanner.nextInt();
                    if (dia > 0 && dia < 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido!\nDigite um dia do mês (1 a 30)");
                    }
                }

                System.out.println("Entre com a hora: ");
                boolean horaValida = false;
                while (!horaValida) {
                    hora = scanner.nextInt();
                    if (hora > 0 && hora < 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida!\nDigite uma hora do mês (1 a 24)");
                    }
                }

                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);


            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
