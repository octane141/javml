//program 10
import java.util.Scanner;
class Leap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Leap ob = new Leap();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();
        if(ob.isLeap(y))
            System.out.println(y + " is a leap year.");
        else
        System.out.println(y + " is not a leap year.");
    }

    public boolean isLeap(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}