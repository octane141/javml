//program 3
class Facto
{
    public static void main(String args[])
    {
        int n = 5;
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial is " + fact);
    }
}