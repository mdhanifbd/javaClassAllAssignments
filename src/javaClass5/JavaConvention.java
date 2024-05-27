// According to Java Naming Convention package name should start with small letter and if multypal
// words then each word first letter must upper letter.

package javaClass5; // 1st letter is small and though two letter so 2nd letter is upper letter;


public class JavaConvention { //  According to Java Naming Convention class letter should start with upper letter
    // and if multypal words then each word first letter must upper letter and it should be noun;
public static String name = "Hanif"; // here variable name is small letter;
         public void getNmme(){ // here method name 1st letter is small letter and 2nd letter is upper letter;
            System.out.println("Name is"+ " "+ name);
        }

    public static void main(String[] args) {
        JavaConvention convention = new JavaConvention();
        convention.getNmme();
    }
 }

