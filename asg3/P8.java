//program 8
class P8
{
    int a;
    int b;
    P8(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
    public static void main(String[] args)
    {
        P8 ob = new P8(10, 20);
        ob.display();
    }
}