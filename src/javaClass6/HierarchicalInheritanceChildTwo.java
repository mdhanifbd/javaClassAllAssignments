package javaClass6;

public class HierarchicalInheritanceChildTwo extends HierarchicalInheritanceParent{
    int age;

    public void setAge(int number1, int number2){   // this number1 is not same of number1 of addition
        age  = number1-number2;         // because this number1 is parameter value.

        System.out.println("Total age of the given number is "+ age);
    }

    // here we access parent class properties.
    public void devidedNumber(int number1, int number2){   // this number1 is not same of number1 of addition
        num  = number1/number2;         // because this number1 is parameter value.

        System.out.println("Total age of the given number is "+num);
    }

}
