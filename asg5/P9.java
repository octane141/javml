class A
{
    public void meth2()
    {
        final int k = 8;
        k = k + 8;
        //final variable cannot be changed
    }
}

class P9
{
    public static void main(String args[])
    {
        new A().meth2();
    }
}