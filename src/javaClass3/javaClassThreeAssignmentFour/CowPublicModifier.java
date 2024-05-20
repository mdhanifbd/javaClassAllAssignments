package javaClass3.javaClassThreeAssignmentFour;

// Public: One packages, A general class & another class main method and creating object. rules is :
// All Package and inside all class can access (same package and all class can access). // 1+2.
// Here Cow Class is Public Class.

public class CowPublicModifier {

    // properties

    public String name;
    public String color;
    public float size;
    public String gender;
    public int Weight;


    public void name() {
        System.out.println("Name of the cow is " + name);
    }

    public void color() {

        System.out.println("Color of the cow is " + color);
    }

    public void size() {
        System.out.println("Size of the cow is " + size);
    }

    public void gender() {
        System.out.println("Gender of the cow is " + gender);
    }

    public void weight() {
        System.out.println("wait of the cow is " + Weight);

    }

    public static void main(String[] args) {
        CowPublicModifier pathan = new CowPublicModifier();
        pathan.name = "Pathan";
        pathan.size = 9f;
        pathan.color = "white";
        pathan.gender = "male";
        pathan.Weight = 100;

        pathan.name();
        pathan.color();
        pathan.weight();
        pathan.gender();
        pathan.size();

    }
}

