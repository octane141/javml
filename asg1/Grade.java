//program 11
import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int p = sc.nextInt();
        char g;
        if(p >= 90)
            g = 'A';
        else if(p >= 80)
            g = 'B';
        else if(p >= 70)
            g = 'C';
        else if(p >= 60)
            g = 'D';
        else if(p >= 40)
            g = 'E';
        else
            g = 'F';
        System.out.printf("Your Grade is: %c", g);
    }
}