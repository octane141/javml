//program 5
class P5
{
    void d1(P5 ob)
    {
        System.out.println("Method called!");
    }
    void d2()
    {
        d1(this);
    }
    public static void main(String[] args)
    {
        P5 ob = new P5();
        ob.d2();
    }
}
