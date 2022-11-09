class B
{
    final void meth3()
    {
        System.out.println("Method!");
    }
}

class C extends B
{
    void meth3()
    {
        //results in error due to final keyword
        System.out.println("Error!");
    }
}

class P10
{
    public static void main(String args[])
    {
        new C().meth3();
    }
}