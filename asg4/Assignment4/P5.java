//program 5
class A
{
    public void display()
    {
        System.out.println("BASE CLASS");
    }
}

class B extends A
{
    void disp1()
    {
        System.out.println("Called from Child Class: ");
        super.display();
    }
}

class C extends B
{
    void disp2()
    {
        System.out.println("Called from Grandchild Class: ");
        super.disp1();
    }
}

class P5
{
    public static void main(String args[])
    {
        C ob = new C();
        ob.disp2();
    }
}