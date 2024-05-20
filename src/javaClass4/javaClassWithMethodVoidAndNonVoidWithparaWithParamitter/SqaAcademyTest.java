// Create Object for 1 / upper Class

package javaClass4.javaClassWithMethodVoidAndNonVoidWithparaWithParamitter;

public class SqaAcademyTest {
    public static void main(String[] args) {


        SqaAcademy Hanif = new SqaAcademy();
        Hanif.group = "A";
        Hanif.batch = 1;
        Hanif.studentName = "Hanif";
        Hanif.studentId = 2024100;
        //  Method With parameter
        Hanif.learn("A", 1001);
        Hanif.getJob("Hanif", 2024100);

        SqaAcademy Hossain = new SqaAcademy();
        Hossain.group = "B";
        Hossain.batch = 2;
        Hossain.studentName = "Hossain";
        Hossain.studentId = 2024200;
        //  Method With parameter
        Hossain.learn("B", 2001);
        Hossain.getJob("Hossain", 2024200);

        // Method Without Parameter
        SqaAcademy Hamid = new SqaAcademy();
        Hamid.placement=100;
        Hamid.job();

        //  Non Void Method Without Parameter
        SqaAcademy Haroon = new SqaAcademy();
        Haroon.placement=10000;
        Haroon.money();

        // Non void Method Without Parameter
        SqaAcademy Hasan = new SqaAcademy();
        Hasan.add();
        Hasan.sub();

        // Non void Method With  Parameter

        SqaAcademy Hasnnan = new SqaAcademy();
        Hasnnan.sub1(305,203);
        Hasnnan.add1(503,908);

    }
}
