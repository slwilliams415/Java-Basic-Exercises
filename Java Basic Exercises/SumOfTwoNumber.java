/*This Program Adds Two Numbers and Prints Out the Sum */
import java.util.Scanner;

public class SumOfTwoNumber 
{ 
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Please input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Please input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: "+sum);
        input.close();
    }
    
}