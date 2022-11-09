class I
{
    void display()
    {
        System.out.println("Hello");
    }
}

class J extends I
{
    public void meth()
    {
        super.display();
    }
}

class P7
{   public static void main(String args[])
    {
    J ob = new J();
    ob.meth();
    }
}