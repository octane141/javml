//program 4
class P4
{
    static int a = 5;
    void d1(int a)
    {
        this.a = a;
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        new P4().d1(10);
        System.out.println(a);
    }
}
