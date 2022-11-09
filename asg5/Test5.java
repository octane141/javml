//program 5
interface AnimalEat//abstract can have both abstract and normal methods
{
    void eat();
}

interface AnimalSpeak
{
    void speak();
}

class Cat implements AnimalSpeak, AnimalEat
{
        public void eat()
        {
            System.out.println("Cat laps milk.");
        }

        public void speak()
        {
            System.out.println("Cat meows.");
        }
}

class Test5
{
    public static void main(String args[])
    {
        Cat ob  = new Cat();
        ob.eat();
        ob.speak();
    }
}