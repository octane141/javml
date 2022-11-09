//Program 3 case 2
class P3
{
public static void main(String args[])
{
try{
int t = 45/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}