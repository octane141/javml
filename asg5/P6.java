class K
{
    void display()
    {
        System.out.println("Hello");
    }
}

class L extends K
{
    public void meth()
    {
        super.display();
    }
}

class P6
{   public static void main(String args[])
    {
    L ob = new L();
    ob.meth();
    }
}