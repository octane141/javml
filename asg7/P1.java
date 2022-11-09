class P1 extends Thread 
{
	public void run() 
    {
        System.out.println("Thread runs");
	}
	public static void main(String args[])
    {
       P1 ob = new P1();
       ob.start();
	}
}
