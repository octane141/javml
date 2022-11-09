//program 6
class P6
{
    P6(P6 ob)
    {
        System.out.println("Constructor called!");
    }
    P6()
    {
        new P6(this);
    }
    public static void main(String[] args)
    {
        new P6();
    }
}
