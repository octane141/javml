//program 3
interface AnimalEat//abstract can have both abstract and normal methods
{
    void eat();
}

interface AnimalSpeak
{
    void speak();
}

class Horse implements AnimalSpeak, AnimalEat
{
        public void eat()
        {
            System.out.println("Horse chews straw.");
        }

        public void speak()
        {
            System.out.println("Horse neighs.");
        }
}

class Test2
{
    public static void main(String args[])
    {
        Horse ob  = new Horse();
        ob.eat();
        ob.speak();
    }
}