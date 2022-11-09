class M
{
    void display(int b)
    {
        System.out.println("You entered: " + b);
    }
}

class N extends M
{
    public void meth1(int a)
    {
        super.display(a);
    }
}

class P8
{   public static void main(String args[])
    {
    N ob = new N();
    ob.meth1(7);
    }
}