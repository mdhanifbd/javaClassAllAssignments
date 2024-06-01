package javaClass6;

public class SingleInheritanceParent {

    int num;

    public void addition(int number1, int number2){  // this number1 is not same of number1 of addition
        num = number1+number2;                       // because this number1 is parameter value.
        System.out.println("Total sum of the given number is "+ num);
    }

    public void subtraction(int number1, int number2){   // this number1 is not same of number1 of addition
        num = number1-number2;                           // because this number1 is parameter value.
        System.out.println("Total subtraction  of the given number is "+ num);
    }

}
