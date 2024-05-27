package javaClass6;

public class MultilableInheritanceParent extends MultilabelInheritanceFathersFather {

    // by using extends key words we use inheritance and for that we can access all properties
    // of parents class and thats why we can use  num variable here  which is not declared here
    // because  it is a property of parent class.

    String name;
    public void multiplyNumber(int number1, int number2){  // this number1 is not same of number1 of addition
        num = number1*number2;                       // because this number1 is parameter value.
        System.out.println("Total multiplyNumber  of the given number is "+ num);
    }
}
