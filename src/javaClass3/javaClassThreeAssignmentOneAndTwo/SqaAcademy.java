// 1.Make one package where make one class where use variable, method and constructor.

package javaClass3.javaClassThreeAssignmentOneAndTwo;

public class SqaAcademy {
     // properties

    String group;
    int batch;
    String studentName;
    int studentId;

    // constractor
    public SqaAcademy(){

    }

    public SqaAcademy(String group,int batch,String studentName,int studentId){
        this.group=group;
        this.batch=batch;
        this.studentName=studentName;
        this.studentId=studentId;
    }

    // Behaviour // method

    public void learn(){
        System.out.println(group+"  Group student can learn by Hero Bhai");
       // System.out.println(batch+"  Number batch student can learn by Hero Bhai");

    }
    public void getJob(){
        System.out.println(studentName +" can get his job with help of sqa Academy");
       // System.out.println(studentId+" Is that student Id and He can learn by Hero Bhai");
    }

}
