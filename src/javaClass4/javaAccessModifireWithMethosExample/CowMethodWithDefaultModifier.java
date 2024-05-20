package javaClass4.javaAccessModifireWithMethosExample;


// Task : Default: One packages, A general class & another class main method and creating object. rules is :
// Package and inside all class can access (same package and all class can access). // 1+2.
// Here Cow Class is Default Class.


// General Class
 class CowMethodWithDefaultModifier {
    // properties

    String name;
    String color;
    float size;
    String gender;
    int Weight;


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
}



