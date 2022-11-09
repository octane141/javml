//program 3
class P3_1
{
    public int sum(int a, int b)
    {
        return(a + b);
    }
}

class P3 extends P3_1
{
    public static void main(String args[])
    {
        P3_1 ob = new P3();
        int k = ob.sum(3, 4);
        System.out.println(k);
    }
}