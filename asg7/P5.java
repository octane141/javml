public class P5 extends Thread
{    public void run()
    {          for(int i=1; i<5; i++)
        {              try{
		sleep(500);              
        System.out.println(Thread.currentThread().getName());  
        }
        catch(InterruptedException e){
            System.out.println(e);
        }  
            System.out.println(i);  
        }    
    }  
    public static void main(String args[])
    {   
        P5 t0 = new P5();  
        P5 t1 = new P5();   
        P5 t2 = new P5();  
        t0.start();
        t1.start();
        t1.suspend(); 
        t2.start();
        t1.resume();
    }  
}
