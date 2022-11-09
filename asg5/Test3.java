//program 2
interface Animal1//abstract can have both abstract and normal methods
{
    void eat();//by default abstract and public in interface
    void speak();
}

class Cat implements Animal1
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


class Test3
{
    public static void main(String args[])
    {
        Cat ob = new Cat();
        ob.eat();
        ob.speak();
    }
}