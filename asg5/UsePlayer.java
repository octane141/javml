//Program 12
interface Player
{
    void play();
}

class Child implements Player
{
    public void play()
    {
        System.out.println("A child plays with toys.");
    }
}

class Musician implements Player
{
    public void play()
    {
        System.out.println("A Musician plays an instrument.");
    }
}

class Actor implements Player
{
    public void play()
    {
        System.out.println("An actor acts in a play.");
    }
}

class UsePlayer
{
    public static void main(String args[])
    {
        Player ob;
        ob = new Child();
        ob.play();
        ob = new Musician();
        ob.play();
        ob = new Actor();
        ob.play();
    }
}