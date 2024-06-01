package javaClass6;

public class MultilableInharitanceMain {
    public static void main(String[] args) {
        MultilableInheritanceParent parent = new MultilableInheritanceParent();
        // we can access all property of MultilableInheritanceFathersFather Class
        parent.addition(700,2908);
        // we can access all property of MultilableInheritanceParent Class
        parent.multiplyNumber(971,58);


        // if we want to use all properties of child class than we need to make an
        // object of MultilableInheritanceChild Class.

        MultilableInheritanceChild child = new MultilableInheritanceChild();
        // we can access all property of MultilableInheritanceChild Class
        child.setAge(70,20);


    }
}
