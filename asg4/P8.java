//Dynamic Method Dispatch is also known as Runtime polymorphism and simply called method method overriding
//for runtime polymorphism we will use same class reference to call other subclasses.
//you need not write these comments for the assignment (as these are self explanatory)
class M extends O
{
    void me()
    {
        System.out.println("This is class M");
    }
}

class N extends O
{
    void me()
    {
        System.out.println("This is class N");
    }
}

class O
{
    void me()
    {
        System.out.println("This is class O");
    }
}

class P8
{
    public static void main(String args[])
    {
        M m = new M();
        N n = new N();
        O ob;
        ob = m;
        ob.me();
        ob = n;
        ob.me();
    }
}