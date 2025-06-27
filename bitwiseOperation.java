import java.util.Scanner;
public class bitwiseOperation {
 

    
    public static void main(String [] ar)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two value for perform basic Arithmetic operation:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Perform bitwise operation!" );
        System.out.println("Bitwise AND="+(n1&n2) );
        System.out.println("Bitwise OR="+(n1|n2) );
        System.out.println("Bitwise negationof n1=" +(~n1) );
        System.out.println("Bitwise negationof n2=" +(~n2) );

       
     

    }


    
}
