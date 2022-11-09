//program 1
class P1
{
    void display(int a)
    {
        System.out.println("You passed integer: " + a);
    }
    void display(String s)
    {
        System.out.println("You passed String: " + s);
    }
    public static void main(String[] args)
    {
        P1 ob = new P1();
        ob.display(5);
        ob.display("Hello");
    }
}
