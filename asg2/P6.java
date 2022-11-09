//return value from method
class P6
{
    public static void main(String args[])
    {
        P6 ob = new P6(); //default constructor being called
        int k = ob.sum(2, 3);
        System.out.println("Here is the returned value: " + k);
    }

    public int sum(int a, int b)
    {
        return (a + b);
    }
}