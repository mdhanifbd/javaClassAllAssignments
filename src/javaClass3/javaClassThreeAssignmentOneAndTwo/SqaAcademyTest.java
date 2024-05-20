// Create Object for 1 / upper Class

package javaClass3.javaClassThreeAssignmentOneAndTwo;

public class SqaAcademyTest {
    public static void main(String[] args) {
        SqaAcademy Hanif = new SqaAcademy();
        Hanif.group="A";
        Hanif.batch=1;
        Hanif.studentName="Hanif";
        Hanif.studentId=2024100;

        Hanif.learn();
        Hanif.getJob();

        SqaAcademy Hossain = new SqaAcademy();
        Hossain.group="B";
        Hossain.batch=2;
        Hossain.studentName="Hossain";
        Hossain.studentId=2024200;

        Hossain.learn();
        Hossain.getJob();

        SqaAcademy Hamid = new SqaAcademy("c",3,"Hamid",2024300);
        Hamid.learn();
        Hamid.getJob();
    }
}
