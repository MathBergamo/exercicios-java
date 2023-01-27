package com.exerciciosjava.devdojo.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(getNome());//Não é recomendável fazer dessa forma (esteticamente falando)
        System.out.println(getIdade());
    }

    public void setNome(String nome){//Forma de acessar o valor privado por meio do método set
        //Poderia trocar a variável de parâmetro desse metodo para não necessariamente utilizar o this
        this.nome = nome;//Aqui é necessário utilizar o this para encontrar a variável privada.
    }

    public void setIdade(int idade){//Poderia trocar a variável de parâmetro desse metodo para não necessariamente utilizar o this
        if(idade < 0){             //Mas é recomendável deixar o parâmetro do set com o mesmo nome da variável por boas práticas.
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;//Aqui é necessário utilizar o this para encontrar a variável privada e não utilizar.
    }

    public String getNome(){//get e o método  que precisa de retorno, ele será responsável por apresentar o resultado atribuido no set nessa situação.
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
