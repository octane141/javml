//return value from method
class P6
{
    public static void main(String args[])
    {
        P4 ob = new P4(); //default constructor being called
        int k = ob.sum(2, 3);
        System.out.println("Here is the returned value: " + k);
    }

    public int sum(int a, int b)
    {
        return (a + b);
    }
}