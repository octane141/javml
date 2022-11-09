//program 3
class P3
{
    void d1()
    {
        this.d2();
    }
    void d2()
    {
        System.out.println("Used this keyword");
    }
    public static void main(String[] args)
    {
        P3 ob = new P3();
        ob.d1();
    }
}
