package javaClass2;

public class VariableTest {
    //1.instance variable
    long studentId;
    // 2.static variable
    static String departmentName = "CSE";

    // 3. local variable
    public void printDepartmentName(){
        //3. local variable
        String studentName = "Hanif";
    // we can use local variable inside method
     System.out.println("student name is "+ studentName +"student Id"+studentId);
    }
    public void printMark(){
   // local variable
    int mark = 80;
    System.out.println("student mark is "+mark);

    }

    public void printSubject(){
        // local variable
       String subject = "computer";
        System.out.println("student subject is "+ subject);
    }

    public static void main(String[] args) {
     // we can call  static  variable e
       // System.out.println("student Depart Name is "+VariableTest.departmentName );
        // or
        System.out.println("student Depart Name is "+departmentName );

        // to call instance variable we need to make object
        VariableTest test = new VariableTest();
        // here we pass  different variable value in  one instance variable.
        test.studentId = 24920918;
        test.printSubject();
        // second time create an object with sane instance variable but different value.
        VariableTest test1 = new VariableTest();
        test1.studentId = 24920919;
        test.printMark();



    }



}
