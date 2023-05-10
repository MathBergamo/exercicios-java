package com.exerciciosjava.devdojo.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Class animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() { // << Isso é uma sub-classe (anonima )
            @Override
            public void walk(){
                System.out.println("Instance animal walking");
            }
        };

        animal.walk();
    }
}
