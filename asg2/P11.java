import java.util.Scanner;
//check if Palinfrom

class P11
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
        if(r == n)
            System.out.printf("%d is Palindrome.", n);
        else
            System.out.printf("%d is not Palindrome.", n);
    }
}