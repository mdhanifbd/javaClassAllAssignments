package javaClass7.polymorphism;

public class Cat extends Animal{  // here we use extends parent class by using Inheritance.
    @Override
    public void animalSound(){
        System.out.println("Cat sound is Maw maw ");  // here this method  have some  different behaviour  of parent class and it is different.
    }
    public void animalSound2(){
        System.out.println("Cat sound is Maaa maaa ");  // here this method  have some  different behaviour  of parent class and it is different.
    }
}
