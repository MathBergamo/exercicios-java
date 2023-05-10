package com.exerciciosjava.devdojo.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D.Luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);//Aqui ele está referênciando a classe interna
            System.out.println(OuterClassesTest01.this);//Aqui ele está referênciando a classe externa
        }
    }
    public static void main(String[] args) {
        //Para criar um objeto da classe interna (Inner), você precisa de um objeto da classe externa (Outer), pois Inner não é static
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();//Criando uma classe interna pela classe externa

        inner.printOuterClassAttribute();
    }
}
