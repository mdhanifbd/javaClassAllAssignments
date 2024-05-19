package javaClass2;

public class UnaryOperatorTest {

    // instance variable


    public static void main(String[] args) {
        int mark= 33;

        mark = mark+1; // first add and
        mark = mark-1; // sub add

        System.out.println("current value of the mark variable is "+ mark);
        // first print current value of the mark  current value 33 and then add one so value is 34
        System.out.println(mark++);
        // current value of mark local variable.
        System.out.println("current value of the mark variable is "+ mark);
        // current value is 34 so first print 34 then sub one and store in variable
        System.out.println(mark --);
        // to see the current value of 33
        System.out.println("current value of the mark variable is "+ mark);
        // first add one then print -- 33 + 1=34 print and store in the local variable.
        System.out.println(++mark);
        // to see the current value of 34
        System.out.println("current value of the mark variable is "+ mark);
        // first sub one form value 34-1=33
        System.out.println(--mark);
        // to see the current value of 33
        System.out.println("current value of the mark variable is "+ mark);



    }

}
