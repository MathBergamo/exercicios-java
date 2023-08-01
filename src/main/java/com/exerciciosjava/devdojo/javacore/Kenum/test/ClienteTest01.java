package com.exerciciosjava.devdojo.javacore.Kenum.test;

import com.exerciciosjava.devdojo.javacore.Kenum.dominio.Cliente;
import com.exerciciosjava.devdojo.javacore.Kenum.dominio.TipoCliente;
import com.exerciciosjava.devdojo.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO); //Forma de utilizar o enum
        Cliente cliente2 = new Cliente("Akira",TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");//valueOf não retorna baseado no tipo, mas sim, no nome
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}