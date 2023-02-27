package com.exerciciosjava.DIO.OrangeBackEndInter.Collections.Set.Exercicios;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritasSet = new LinkedHashSet<>();
        linguagensFavoritasSet.add(new LinguagemFavorita("Python",1991,"Pycharm"));
        linguagensFavoritasSet.add(new LinguagemFavorita("Java",1991,"Intellij"));
        linguagensFavoritasSet.add(new LinguagemFavorita("C",1995,"Visual Studio"));

        System.out.println("Ordem de inserção:");

        for (LinguagemFavorita linguagem: linguagensFavoritasSet) {
            System.out.println(linguagem);
        }

        System.out.println("\nOrdem natural [NOME] ");
        Set<LinguagemFavorita> linguagemFavoritaSet2 = new TreeSet<>(linguagensFavoritasSet);
        for (LinguagemFavorita linguagem: linguagemFavoritaSet2) {
            System.out.println(linguagem);
        }

        System.out.println("\nOrdem por IDE");
        Set<LinguagemFavorita> linguagemFavoritaSet3 = new TreeSet<>(new ComparatorIde());
        linguagemFavoritaSet3.addAll(linguagensFavoritasSet);
        for (LinguagemFavorita linguagem: linguagemFavoritaSet3) {
            System.out.println(linguagem);
        }

        System.out.println("\nOrdem por Ano de criação e nome");
        Set<LinguagemFavorita> linguagemFavoritaSet4 = new TreeSet<>(new ComparatoranoDeCriacaoEnome());
        linguagemFavoritaSet4.addAll(linguagensFavoritasSet);
        for (LinguagemFavorita linguagem: linguagemFavoritaSet4) {
            System.out.println(linguagem);
        }

        System.out.println("\nOrdem por Nome, ano de Criação e IDE");
        Set<LinguagemFavorita> linguagemFavoritaSet5 = new TreeSet<>(new ComparatoranoDeCriacaoEnomeEide());
        linguagemFavoritaSet5.addAll(linguagensFavoritasSet);
        for (LinguagemFavorita linguagem: linguagemFavoritaSet5) {
            System.out.println(linguagem);
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public int anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatoranoDeCriacaoEnome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao,lf2.anoDeCriacao);
        if (anoDeCriacao != 0 ) return anoDeCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatoranoDeCriacaoEnomeEide implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome); //Forma de comparar Strings
        int anoDeCriacao = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao); //Forma de comparar números inteiros
        if (nome != 0) return nome; //Essa condição é feita dessa forma, pois o Comparator retorna 1 caso o valor esteja na posição superior.
                                    //-1 caso seja inferior, ou 0 caso sejam da mesma posição de acordo com o Formato.
                                    //(O Formato Tree utiliza a ordem natural, pior perfomancec)
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

