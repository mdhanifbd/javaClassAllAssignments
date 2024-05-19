package javaClass2;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        int num1 = 33, num2 = 66 , num3;

        num1=(num1>num2)?num1:num2;  // condition is false so it will print num2 66,
        System.out.println(num1);  // new num1 value is 66.
        System.out.println(num2);  // num2 real value is 66.

        num3 = (num1>num2) ? num1 : num2; // condition true so it will print num1 66 and num3 value is 66.
        System.out.println("number one current value is "+num1);
        System.out.println("Number two current value is"+num2);
        System.out.println("Number three current value is "+num3);


    }


}
