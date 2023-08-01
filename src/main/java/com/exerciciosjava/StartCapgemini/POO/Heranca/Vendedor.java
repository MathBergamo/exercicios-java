package com.exerciciosjava.StartCapgemini.POO.Heranca;

public class Vendedor extends Funcionario{
    private int totalItensVendidos;
    private float comissaoPorItem;

    public Vendedor(){
        super();//Isso é utilizado para chamar o construtor da superclaasse (classe mãe, Funcionario)
        //Definir que o Vendedor é um Funcionario
    }
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}
