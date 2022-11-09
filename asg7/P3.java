class A extends Thread
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("A: " + i);
            if(i == 3)
                yield();
        }
        System.out.println("End of class A");
    }
}

class B extends Thread
{
    public void run()
    {
        for(int i = 0; i < 5; i++)
            System.out.println("B: " + i);
        System.out.println("End of class B");
    }
}

class P3
{
    public static void main(String args[])
    {
        new A().start();
        new B().start();
    }
}