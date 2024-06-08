package javaClass4.javaClassDecissionMakingStatement;
//
public class IfElseLadder {
    public static void main(String[] args) {
        int age = 80;   // senior citizen
        //int age = 220; // All condition are false

        if (age >= 80 && age <= 100){
            System.out.println("senior citizen");
        } else if (age >= 70 && age < 60) { // 80 >= 70 , 80 <60 (both true)
            System.out.println(" Normal Citizen");
        }else if (age >= 75 && age < 60) {  // 80 >= 75 , 80 <60 (one true and one false)

            System.out.println(" our side Citizen");
        }else if (age >= 70 && age < 50) { // 80 >= 70 , 80 <50 (one true and one false)
            System.out.println(" Non Citizen");
        }else if (age >= 90 && age < 40) { // 80 >= 90 , 80 <40 (both false)
            System.out.println(" Not Citizen");
        }else {
            System.out.println("All condition are false");
        }


    }
}
