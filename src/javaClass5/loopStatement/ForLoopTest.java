package javaClass5.loopStatement;

public class ForLoopTest {
    public static void main(String[] args) {

        // For Loop
        // Old for loop with increment, decrement & (;condition;)
        for (int i=0;i<=60;i+=15){
            System.out.println(i);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++");
        // Print first than increment
        int account = 0;
        for (;account <20;){
            System.out.println(account);
            account++; // first print than increment;
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        // increment first than print
        int acount = 0;
        for (;acount <20;){
            acount++;  // 1st increment than print;
            System.out.println(acount);
        }

         }

}


