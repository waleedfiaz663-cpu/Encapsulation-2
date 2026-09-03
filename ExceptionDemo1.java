import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int divident=Sc.nextInt();
        int divisor=Sc.nextInt();
        try{
        int result=divident/divisor;
        System.out.println("Result is : "+result);
    }
        catch(ArithmeticException e){
            System.out.println("Divisor cant be zero");
        }
            
        }
}
