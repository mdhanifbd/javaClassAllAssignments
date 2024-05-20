package javaClass3;

public class PersonTest {
    public static void main(String[] args) {

        Person Hanif = new Person();  // create an object of person class with given value
        Hanif.name="Hanif";  // we pass value
        Hanif.gender="Male";  // we pass value
        Hanif.height=5.7f;   // we pass value

        Hanif.walk();  // we call method
        Hanif.speak();  // we call method


        Person Hossain = new Person(); // create an object of person class with given value
        Hossain .name="Hossain"; // we pass value
        Hossain .gender="Male";  // we pass value
        Hossain .height=6.7f;   // we pass value

        Hossain.walk(); // we call method
        Hossain.speak();  // we call method

        Person Hamida = new Person();// create an object of person class with given value
        Hamida .name="Hamida";  // we pass value
        Hamida .gender="Female";  // we pass value
        Hamida .height=4.7f;     // we pass value


        Hamida.walk();   // we call method
        Hamida.speak();  // we call method

        Person Haroon = new Person("Haroon","Male",6.51f); // create an object of person class with given value in parameter.
        Haroon.walk();  // we call method
        Haroon.speak();  // we call method
    }
}
