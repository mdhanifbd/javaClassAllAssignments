package javaClass7.polymorphism;

public class MethodOverrideMian {
    // / same method but behaviour different and it is called override.

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();  // same method but behaviour different.

        Cat cat = new Cat();
        cat.animalSound();  // same method but behaviour different.

        Animal animal = new Animal();
        animal.animalSound();  // same method but behaviour different.

        Animal cat2 = new Cat(); // we create object of parent class(Animal).And thats why child class (cat) all common  behaviour will access here
        // only different method behaviour of parent class can  not access here .
        cat2.animalSound(); // here parent class method behaviour if common with child class method behaviour then it will accept .
        // but others behaviour of child class will not get.
    }
}
