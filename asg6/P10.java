class P10
{
    public static void main(String args[])
    {
        int sum = 0, i;
        double perc;
        String name = args[0];
        try{
        for(i = 1; i < args.length; i++)
        {
            if(Integer.parseInt(args[i]) > 50 || Integer.parseInt(args[i]) < 0)
                throw new RangeException("marks out of bounds");
            sum += Integer.parseInt(args[i]);
        }
        perc = sum/((i - 1)*50.0)*100;
        System.out.println("Name: " + name + "\nSum: " + sum + "\nPercentage: " + perc);
        }
        catch(RangeException e)
        {
            System.out.println(e);
        }
    }
}

class RangeException extends Exception
{
    public RangeException(String str)
    {
        super(str);
    }
}