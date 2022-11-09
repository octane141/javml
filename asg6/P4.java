class P4
{
public static void main(String args[])
{
try{
int t = 45/0;
int k = Integer.parseInt("ABC");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(NumberFormatException f)
{
System.out.println(f);
}
}
}