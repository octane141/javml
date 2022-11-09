import java.util.Scanner;
//check if Prime

class P12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                c++;
        if(c == 2)
            System.out.println(n + " is Prime.");
        else
            System.out.println(n + " is not Prime.");
    }
}