// 1.Make one package where make one class where use variable, method and constructor.

package javaClass4.javaClassWithMethodVoidAndNonVoidWithparaWithParamitter;

public class SqaAcademy {
    // properties

    String group;
    int batch;
    String studentName;
    int studentId;

    int placement;


    // Behaviour
    //  Void Method With parameter

    public void learn(String group, int batch) {
        System.out.println(group + "  Group student can learn by Hero Bhai");
        System.out.println(batch + "  Number batch student can learn by Hero Bhai");

    }

    // Void Method With parameter
    public void getJob(String studentName, int studentId) {
        System.out.println(studentName + " can get his job with help of sqa Academy");
        System.out.println(studentId + " Is that student Id and He can learn by Hero Bhai");
    }

    // Void Method Without parameter
    public void job() {
        System.out.println(placement + " " + "SQA Student job placement percentage ");
    }

    // Void Method Without parameter
    public void money() {
        System.out.println(placement + "" + "Taka will provide by sqa if no job placement");
    }

    //  Method Without parameter
    public int add() {
        int num1 = 32, num2 = 59, num3;
        num3 = num1 + num2;
        System.out.println("Total is "+num3);
        return num3;
           }
    //  Method Without parameter
    public int sub() {
        int num1 = 132, num2 = 59, num3;
        num3 = num1 - num2;
        System.out.println("Total remain is "+num3);
        return num3;
    }

    //  Method With parameter
    public int sub1( int num1, int num2) {
       int num3;
        num3 = num1 - num2;
        System.out.println("Total remain is "+num3);
        return num3;
    }

    //  Method Without parameter
    public int add1(int num1, int num2) {
     int  num3;
        num3 = num1 + num2;
        System.out.println("Total is "+num3);
        return num3;
    }

}


