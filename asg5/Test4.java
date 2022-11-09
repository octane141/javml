//program 4
interface Animal2//abstract can have both abstract and normal methods
{
    abstract void eat();
    abstract void speak();
}

class Rat implements Animal2
{
    public void eat()
    {
        System.out.println("Rat eats.");
    }

    public void speak()
    {
        System.out.println("Rat squeaks.");
    }
}

class Test4
{
    public static void main(String args[])
    {
        Rat ob = new Rat();
        ob.eat();
        ob.speak();
    }
}