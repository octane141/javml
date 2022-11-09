//program 7
class P7
{
    P7 d1()
    {
        return this;
    }
    void d2()
    {
        System.out.println("Returned current class instance!");
    }
    public static void main(String args[])
    {
        new P7().d1().d2();
    }
}