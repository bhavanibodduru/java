import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");
        }
    }
}
