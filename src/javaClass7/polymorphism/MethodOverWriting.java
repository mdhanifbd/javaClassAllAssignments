package javaClass7.polymorphism;

public class MethodOverWriting {
    int number;
    public void addition(){ //   here Method name is same but parameter is different.
        System.out.println("Total addition is "+ number); // it is called overwriting.
    }

    public void addition(int num1){  // here Method name is same but parameter is different
        int num2=149;
        number=num1+num2;
        System.out.println("Total addition is "+ number); // it is called overwriting.
    }

    public void addition(int num1,int num2){  // here Method name is same but parameter is different.
        number = num1+num2;
        System.out.println("Total addition is "+ number);// it is called overwriting.

    }

    public static void main(String[] args) {
        MethodOverWriting  methodOverWriting = new MethodOverWriting();
        methodOverWriting.addition();
        methodOverWriting.addition(420);
        methodOverWriting.addition(342,986);

    }


}


