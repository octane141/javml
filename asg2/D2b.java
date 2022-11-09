//program 13
//decimal to binary and binary to decimal
import java.util.Scanner;
public class D2b
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i = 0, n, c, de = 0, d;
String bi = new String();
System.out.print("1 for d2b & 2 for b2d: ");
int ch = sc.nextInt();
switch(ch)
{
case 1:
System.out.print("Enter decimal number: ");
n = sc.nextInt();
c = n;
while(c!=0)
{
d = c % 2;
bi = d + bi;
c = c / 2;
}
System.out.println("The Binary is " + bi);
break;
case 2:
System.out.print("Enter binary number: ");
n = sc.nextInt();
c = n;
while(c != 0)
{
d = c % 10;
de = de + (int)Math.pow(2, i++)*d;
c = c / 10;
}
System.out.print("the Decimal is " + de);
break;
default:
System.out.print("INVALID INPUT");
}
}
}