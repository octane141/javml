class P5
{
public static void main(String args[])
{
try{
int k = Integer.parseInt("ABC");
try{
int t = 45/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
catch(NumberFormatException f)
{
System.out.println(f);
}
}
}