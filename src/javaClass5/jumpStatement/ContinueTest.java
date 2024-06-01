package javaClass5.jumpStatement;

public class ContinueTest {
    public static void main(String[] args) {
        // conditional loop
        // Jumping --Continue means not to print;
        // masud will not print and there after  print All.
        // means when masud found it will not print masud and print all other name ;
        String nams []={"masum","mamun","masud","kabir"};
        for (String nam2 :nams){

            if(nam2.equals("masud"))continue; // when masud found it will our from loop.
            System.out.println(nam2);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        for (int n=0;n<10;n++){
            if(n==5){  // condition is 5
                System.out.println(n);
                continue; // 5 will  print only
            }
        }
    }
}
