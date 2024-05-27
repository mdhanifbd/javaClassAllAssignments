package javaClass7.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();  // we create object of child class to take all abtract class method .
        toyota.carCalour(); // it is a behaviour of Car Class (parent class)
        toyota.carCC();  // it is a behaviour of Car Class (parent class)
        toyota.carWheel();  // it is a behaviour Car Class (parent class)
        toyota.modelNumber();  // it is a behaviour of Car Class (parent class)
        toyota.body();  // it is a behaviour of Toyota Class (Child class)


        System.out.println("+++++++++++++++++++++++++++++++");

      Car car=new Toyota();
      car.carCalour();  // it is a behaviour of Toyota Class (Child class) which is override from Interface.
      car.carWheel();   // it is a behaviour of Toyota Class (Child class) which is override from Interface.
      car.modelNumber();  // it is a behaviour of Toyota Class (Child class) which is override from Interface.
      car.carCC();  // it is a behaviour of Toyota Class (Child class) which is override from Interface.
       //  toyota.body();  // we can not get because this behaviour is toyota class (child class)


    }
}
