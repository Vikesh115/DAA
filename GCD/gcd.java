package GCD;
import java.util.Scanner;
public class gcd
{
     public static int GcdNum(int x, int y)
     {

    if(x==y){
        return x;
    }
    else if(x>y)
    {
        x = x-y;
    }
    else{
        y = y-x;
    }
    return y;
 }
 // Note:-
 // if GCD(x,y) == 1 then number are co-prime or prime numbers;

public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int gcd = GcdNum(x,y);
   System.out.println("GCD is : " +gcd);
}
}
