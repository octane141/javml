//program 5
class Facto1
{
    public int fact(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f *= i;
        }
        return f;
    }
}