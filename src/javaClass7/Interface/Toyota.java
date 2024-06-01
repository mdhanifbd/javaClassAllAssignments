package javaClass7.Interface;

public class Toyota implements Car{ // Toyota is a normal class (child class)we implements
                                // Car class (parenr class ) and we have to override all the method.

    @Override
    public void carWheel() {
        System.out.println("Toyota has Four wheel and this is from child class which is override");
    }

    @Override
    public void carCalour() {
        System.out.println("Toyota avanza has know Five calour available and this is from child class which is override. ");

    }

    @Override
    public void carCC() {
        System.out.println("Toyota avanza has 1500 CC and this is from child class which is override");

    }

    @Override
    public void modelNumber() {
        System.out.println("Toyota avanza Engin Model Number 2NR-VE and  this is from child class which is override");

    }
    public void body(){
        System.out.println(" Toyota avenaz has High Tensile Body and Stability and this is from child class");
    }
}
