package javaClass7.abstraction;

public class HondaByke extends Byke{ // HondaByke is a normal class
                                  // and we extends parenr abstract class thats why
                               // we override all the abstract methods.
    @Override
    public void Wheel() {
        System.out.println("Honda has two Wheel and this is from child class which is override ");

    }

    @Override
    public void seat() {
        System.out.println("Honda has two seat for the passanger and this is from child class which is override");

    }

    public void cc(){
        System.out.println("Honda X-Blade 160 cc and this is from child class");
    }
}
