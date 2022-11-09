class A
{
    void meth()
    {
        System.out.println("This is class A");
    }
}

class B extends A
{
    void meth1()
    {
        System.out.println("Called from class B: ");
        new A().meth();
    }
}

class C extends A
{
    void meth2()
    {
        System.out.println("Called from class C: ");
        new A().meth();
    }
}

class P6 //2 extends cannot be used for java
{
    public static void main(String args[])
    {
        System.out.println("Called from main: ");
        new C().meth2();
        new B().meth1();
    }
}