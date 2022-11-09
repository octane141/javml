//Program 8 case 1
class P8_1
{
public static void main(String args[])
{
int t = 0;
try{
t = 45/5;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
    System.out.println("Program Executed: " + t);
}
}
}