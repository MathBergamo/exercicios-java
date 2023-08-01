package com.exerciciosjava.DIO.OrangeBackEndInter.Debbuging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou no método main");
        a();//Irá entrar no método a() antes de ir para a linha 7 (próxima linha)
        System.out.println("finalizou o método main");

    }
    static void a(){//É possível criar um método sem public, static ou protected, por default, se nada for escrito, será utilizado "public"
        System.out.println("Entrou no método a");
        b();//Irá entrar no método b() antes de ir para a linha 12 (próxima linha)
        System.out.println("Finalizou o metodo a.");
    }
    static void b(){//É possível criar um método sem public, static ou protected, por default, se nada for escrito, será utilizado "public"
        System.out.println("Entrou no método b");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();//Irá entrar no método c() antes de ir para a linha 18 (próxima linha)
        System.out.println("Finalizou o metodo b.");
    }
    static void c(){//É possível criar um método sem public, static ou protected, por default, se nada for escrito, será utilizado "public"
        System.out.println("Entrou no método c");
        Thread.dumpStack();//Apresenta as stackTraces (linhas vermelhas da excpetion, ex: at com.example.exerciciosjava/com.exerciciosjava.DIO.OrangeBackEndInter.Debbuging.Main.main(Main.java:6)
        System.out.println("Finalizou o metodo c.");
    }
}
