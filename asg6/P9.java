class P9
{
    public static void main(String args[])
    {
        try{
        if(args.length<5)
            throw new CheckArgumentException(Integer.toString(args.length));
        int sum = 0;
        for(int i = 0; i < args.length; i++)
            sum += Integer.parseInt(args[i]);
        System.out.println("Sum: " + sum);
        }
        catch(CheckArgumentException e)
        {
            System.out.println(e);
        }
    }
}

class CheckArgumentException extends Exception
{
    public CheckArgumentException(String str)
    {
        super(str);
    }
}