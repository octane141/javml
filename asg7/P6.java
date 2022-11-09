class P6 extends Thread {
 long count;
 P6() {   count=0;   }
public void run() {
while(count < 20){	
	try{  count++;
		Thread.sleep(1000); 	
             System.out.println(count);
	}	catch(InterruptedException e){}
	} 
}
public static void main(String str[]){
	P6 c= new P6();
	c.start();
	System.out.println("Ok");
}
}
