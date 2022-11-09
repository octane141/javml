import java.util.Scanner;
//check if Armstrong

class P14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int c = n, d = 0, r = 0;
        while(c != 0)
        {
            d++;
            c /= 10;
        }
        c = n;
        while(c != 0)
        {
            r = r + (int)Math.pow(c % 10, d);
            c = c/10;
        }
        if(r == n)
            System.out.printf("%d is an Armstrong number.", n);
        else
            System.out.printf("%d is not an Armstrong number.", n);
    }
}