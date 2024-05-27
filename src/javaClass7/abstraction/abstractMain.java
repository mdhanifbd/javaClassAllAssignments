package javaClass7.abstraction;

public class abstractMain {
    public static void main(String[] args) {

        HondaByke hondaByke=new HondaByke();  // we create object of child class HondaByke
                          // to take all abtract  Byke class  method (parent)and Honda class behaviour.(child)
        hondaByke.seat(); // it is a behaviour of Byke Class (parent class)
        hondaByke.cc();   // it is a behaviour of HondaByke Class (child class )
        hondaByke.Wheel();  // it is a behaviour of Byke Class (parent class)
        hondaByke.Horn();  // it is a behaviour of Byke Class (parent class)
    }
}
