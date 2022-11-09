//program 2
class P2
{
    P2(int a)
    {
        System.out.println("You passed integer: " + a);
    }
    P2(String s)
    {
        System.out.println("You passed String: " + s);
    }
    public static void main(String[] args)
    {
        new P2(7);
        new P2("JAVA");
    }
}