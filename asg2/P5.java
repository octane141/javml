//Access Parameterized Contructor
class P5
{
    P5(int a)
    {
        System.out.println("This is the passed value: " + a);
    }

    public static void main(String args[])
    {
        P5 ob = new P5(5); //parameterized constructor being called
    }
}