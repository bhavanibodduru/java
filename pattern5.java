import java.util.*;

public class lefthalf {
    
    public static void main(String args[])
    {
        int i, j;
        int num = 2 * 5 - 2;
        for (i = 5; i > 0; i--) {
            
            for (j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            
            num = num - 2;
            
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
   
