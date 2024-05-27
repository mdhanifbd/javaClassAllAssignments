package javaClass6;

public class HierarchicalInheritanceMain {

    public static void main(String[] args) {
        // create an object of childOne class we can access all property of Parent class like
        // method addition + subtraction and his own properties like multiplyNumber.

        HierarchicalInheritanceChildOne childOne = new HierarchicalInheritanceChildOne();
        childOne.addition(654,1245); // access from parent class.
        childOne.subtraction(79654,234); // access from parent class.
        childOne.multiplyNumber(987,543); // access from childOne class.

        // create an object of childTwo class we can access all property  of parent class like
        // method addition + subtraction and his own properties like devidedNumber.

        HierarchicalInheritanceChildTwo childTwo=new HierarchicalInheritanceChildTwo();
        childTwo.addition(6753,987765);  // access from parent class.
        childTwo.subtraction(9898,768);  // access from parent class.
        childTwo.devidedNumber(9876,43); // access from ChildTwo class.

        // create an object of childthree class we can access all property of parent class like
        // method addition + subtraction and his own properties like setAge.

        HierarchicalInheritanceChildThree childThree=new HierarchicalInheritanceChildThree();
        childThree.addition(8769,3425);  // access from parent class.
        childThree.subtraction(98987,3245); // access from parent class.
        childThree.setAge(90,56);  // access from CFhildThree  class.


    }


}
