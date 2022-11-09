class P4 extends Thread {
 long count;
 P4() {   count=0;         }
public void run() {
while(count < 20){	
	try{  count++;
		Thread.sleep(1000); 	
             System.out.println(count);
	}	catch(InterruptedException e){}
	} }
public static void main(String str[]){
	P4 c= new P4();
	c.start();
	System.out.println("Ok");
//10 lines 
}
     }