package javaClass5.jumpStatement;

public class BreakTest {
    public static void main(String[] args) {

        // conditional loop
        // Jumping --break means when found out from loop;
        // masud will print and there after no more print.
        // means when masud found break means it will out from loop;
        String nam []={"masum","mamun","masud","kabir"};
        for (String nam1 :nam){
            System.out.println(nam1);
            if(nam1.equals("masud"))break; // when masud found it will our from loop.
        }
    }
}
