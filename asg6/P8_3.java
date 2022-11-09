//Program 8 case 3
class P8_3
{
public static void main(String args[])
{
int t;
try{
t = 45/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{
    System.out.println("Program Executed!");
}
}
}