//program 4
class A
{
    public void display()
    {
        System.out.println("BASE CLASS");
    }
}

class B extends A
{
    void disp()
    {
        System.out.println("Called from Child Class 1: ");
        super.display();
    }
}

class C extends A
{
    void disp()
    {
        System.out.println("Called from Child Class 2: ");
        super.display();
    }
}

class P4
{
    public static void main(String args[])
    {
        B ob1 = new B();
        C ob2 = new C();
        ob1.disp();
        ob2.disp();
    }
}