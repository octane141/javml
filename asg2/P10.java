import java.util.Scanner;
//reverse a number

class P10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int c = n, d, r = 0;
        while(c != 0)
        {
            d = c%10;
            r = r*10 + d;
            c = c/10;
        }
        System.out.printf("The reverse of %d is %d", n, r);
    }
}