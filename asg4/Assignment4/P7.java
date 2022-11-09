//program 7
class P7_1 extends P7
{
    public int sum(int a, int b)
    {
        return(a + b);
    }
}

class P7_2 extends P7
{
    public int sum(int a, int b, int c)
    {
        return(a + b + c);
    }
}


class P7
{
    public static void main(String args[])
    {
        P3_1 ob = new P3();
        int k;
        k = new P7_1().sum(3, 4);
        System.out.println(k);
        k = new P7_2().sum(3, 4, 5);
        System.out.println(k);
    }

    int sum()
    {
        return 0;
    }
}