class P9
{
    public static void main(String args[])
    {
        K ob = new K();
        ob.met();//will give error
    }

    final void met()//same can be achieved using static or private keywords
    {
        System.out.println("This is base class.");
    }
}

class K extends P9
{
    void met()//would have been called otherwise keyword used
    {
        System.out.println("This is subclass.");
    }
}