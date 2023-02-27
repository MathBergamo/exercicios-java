package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Map;

import java.util.*;

/*
Autor = Hawking, Stephen - Livro = nome: Uma breve história do tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O poder do Hábito. páginas: 408
Autor = Harari, Yuval Noah - Livro = nome: 21 Lições para o século 21. páginas: 432
 */
public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livrosSet = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o século 21",432));
        }};
        System.out.println("Ordem aleatória: \n");
        for (Map.Entry<String, Livro> livro: livrosSet.entrySet()) {
            System.out.println(livro.getValue() + " - " + livro.getKey());
        }

        System.out.println("\nOrdem de inserção: ");
        Map<String, Livro> livrosSet2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o século 21",432));
        }};
        for (Map.Entry<String, Livro> livro: livrosSet2.entrySet()) {
            System.out.println(livro.getValue() + " - " + livro.getKey());
        }

        System.out.println("\nOrdem alfabetica dos autores: ");
        Map<String,Livro> livrosSet3 = new TreeMap<>(livrosSet);
        for (Map.Entry<String, Livro> livro: livrosSet3.entrySet()) {
            System.out.println(livro.getValue() + " - " + livro.getKey());
        }

        System.out.println("\nOrdem alfabética dos livros: ");
        Set<Map.Entry<String, Livro>> livrosSet4 = new TreeSet<>(new ComparatorNome()); //Necessário colocar em Set para ordenar em ordem alfabética!
        livrosSet4.addAll(livrosSet.entrySet());
        for (Map.Entry<String, Livro> livro: livrosSet4) {
            System.out.println(livro.getValue() + " - " + livro.getKey());
        }

        System.out.println("\nOrdem por número de página: ");
        Set<Map.Entry<String,Livro>> livroSet5 = new TreeSet<>(new ComparatorPagina());
        livroSet5.addAll(livrosSet.entrySet());
        for (Map.Entry<String, Livro> livro: livroSet5) {
            System.out.println(livro);
        }
    }
}

class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String,Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> p1, Map.Entry<String, Livro> p2) {
        return p1.getValue().getPaginas().compareTo(p2.getValue().getPaginas());
    }
}