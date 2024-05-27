package javaClass6;

public class MultilableInheritanceChild extends MultilabelInheritanceFathersFather {
    int age;

    public void setAge(int number1, int number2){   // this number1 is not same of number1 of addition
        age  = number1-number2;         // because this number1 is parameter value.

        System.out.println("Total age of the given number is "+ age);
    }
    }
