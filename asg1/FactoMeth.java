//program 4
class FactoMeth
{
    int fact(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }

    public static void main(String args[])
    {
        FactoMeth ob = new FactoMeth();
        int n = 6;
        int facto = ob.fact(n);
        System.out.println("The factorial(by using method) is " + facto);
    }
}