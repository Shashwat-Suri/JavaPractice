package practice;

class MyNewThread extends Thread {
	MyNewThread(String x){
		super(x);
		System.out.println(x+" has started");
		start();
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("New Thread:"+i);
				sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("New Thread Interrupted");
		}
		System.out.println("My Thread Ends");
	}
}

public class Thread3{
	public static void main(String args[]) {
		System.out.println("Main Thread has started");
		new MyNewThread("My Thread");
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread:" +i);
				Thread.sleep(2000);
			}
		} catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread ends");
	}
}