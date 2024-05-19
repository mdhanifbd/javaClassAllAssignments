package javaClass2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int num1 = 33 ,num2 = 66;

        System.out.println((num1 != num2) && (num1 <= num2)); // all must be true  here all true so it will print true;
        System.out.println((num1 == num2) || (num1 <= num2)); // One must be true  here 2nd condition is true so it will print true;
        System.out.println((num1 != num2) && (num1 >= num2)); // all must be true  here one true and one false  so it will print false;
        System.out.println((num1 == num2) && (num1 <= num2)); // all must be true  here all false so it will print false;





    }




}
