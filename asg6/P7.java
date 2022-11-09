class P7
{
public static void main(String args[])throws ArithmeticException
{
try{
throw new ArithmeticException("Problem Simulation!");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}