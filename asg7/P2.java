public class P2 implements Runnable
{
	public void run() 
    {
        System.out.println("Runnable implemented");
	}
	public static void main(String args[])
    {
        P2 o = new P2();
       Thread ob = new Thread(o);
       ob.start();
	}
}
