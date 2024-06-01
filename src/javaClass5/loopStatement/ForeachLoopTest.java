package javaClass5.loopStatement;

public class ForeachLoopTest {
    public static void main(String[] args) {

        // Loop
        // for each with Two more data Arrays
        int []numbers= { 50,30,44,66,88};
        // which type of variable in Array we will take in for each loop;
        for (int num :numbers){
            System.out.println(num); // it will print all value;
        }
        // or Traditional Loop
        for (int i=0; i<=numbers.length;i++){
            System.out.println(i); // it will print all value;
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        // using String
        String []names= { "Hanif","Hossain","Yusuf","Hamid"};
        // which type of variable in Array we will take in for each loop;
        for (String name :names){
            System.out.println(name); // it will print all value;
        }

    }
}
