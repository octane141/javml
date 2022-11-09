class P7
{
    public static void main(String args[])
    {
        P7 ob = new P7(); //default constructor being called
        int k = ob.sum(4, 6);//call by value
        System.out.println("Here is the returned value: " + k);
        ob.display();//call by reference
    }

    public void display()
    {
        System.out.println("HELLO WORLD!");
    }

    public int sum(int a, int b)
    {
        return (a + b);
    }
}