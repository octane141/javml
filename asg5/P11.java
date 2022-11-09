final class E
{
    public void meth2()
    {
        System.out.println("Hello");
        //final variable cannot be changed
    }
}

class P11 extends E
{
    //final class cannot be inherited
    public static void main(String args[])
    {
        new E().meth2();
    }
}