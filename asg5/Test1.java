//program 1
abstract class Animal//abstract can have both abstract and normal methods
{
    abstract void eat();
    abstract void speak();

    void something()
    {
        System.out.println("Something.");
    }
}

class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog eats.");
    }

    void speak()
    {
        System.out.println("Dog barks.");
    }
}
class Test1
{
    public static void main(String args[])
    {
        Dog ob = new Dog();
        ob.eat();
        ob.speak();
        ob.something();
    }
}