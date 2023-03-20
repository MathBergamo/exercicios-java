package com.exerciciosjava.StartCapgemini.POO.Testes;

public class Pessoa {
    /*Atributos
    Os atributos de uma classe só devem ser acessados por um método disponibilizdo pela mesma.
    (Getters e Setters)
    É possível fazer a validação pelos métodos de Get/Set
     */
    private float peso;
    private float altura;

    public Pessoa(float peso, float altura) {// O método cconstrutor é necessário quando você precisa passar um valor pré-definido.
        this.peso = peso;
        this.altura = altura;
    }

    public float calcularIMC(){
        return peso / (altura * altura);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
