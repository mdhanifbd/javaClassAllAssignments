// Public: One packages, A general class & another class main method and creating object. rules is :
// Package and  all class can access .
// Here CowOne  Cla
package javaClass4.javaAccessModifireWithMethosExample;

// task: Private: A class for private with main method & Object must
// Package and inside all class can access (same package and all class can access). // 1+2.
// Here Cow Class has private modifier in variable So it will run only this package.


public class CowMethodWithPrivateModifier {


    // properties
    // here all instance variable are private
    private String name;
    private String color;
    private float size;
    String gender;
    private int Weight;


    private void name() {
        System.out.println("Name of the cow is " + name);
    }

    private void color() {

        System.out.println("Color of the cow is " + color);
    }

    private void size() {
        System.out.println("Size of the cow is " + size);
    }

    private void gender() {
        System.out.println("Gender of the cow is " + gender);
    }

    private void weight() {
        System.out.println("wait of the cow is " + Weight);

    }

    public static void main(String[] args) {
        CowMethodWithDefaultModifier pathan = new CowMethodWithDefaultModifier();
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


