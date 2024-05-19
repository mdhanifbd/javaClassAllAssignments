package javaClass2;

public class AssignmentOperatorTest {

    public static void main(String[] args) {

        int num1 = 33, num2 = 44;

        num1 += num2;  // num1 = 33+44 = 77 in curent value of num1.
        System.out.println(num1);

        num2 -= num1;  // 44-77  num2 current value is -33
        System.out.println(num2);

        num1*=num2;  // 77*-33 = -2541. num1 current value of num1 is -2541
        System.out.println(num1);

        num2/=11;  // -33 / 11= -3  current value of num2 is -3
        System.out.println(num2);

        num1 %= 6;  // -2541 % 6 = -3
        System.out.println(num1);

        // so current value of num1 = -2541 , num2 = -3

    }

}
