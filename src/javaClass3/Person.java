package javaClass3;

public class Person {

    String name;  // properties This is instance variable
    String gender;  // properties
    float height;  // properties

    public Person(){

    }

    public Person(String name,String gender, float height){   // we give value
           this.name=name;  // this means current class variable.
           this.gender=gender;  // this left side is properties and right side  is parameter
           this.height=height;   // we use because we will provide value .
    }



    public void walk(){      // Behaviour
        System.out.println(name + "Can Walk");
    }

    public  void speak(){   // Behaviour

        System.out.println(" All can speak and their gender is "+ gender+"And this is from parent class");
    }
}
