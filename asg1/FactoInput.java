//program 6
import java.util.Scanner;
class FactoInput
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial is " + fact);
    }
}