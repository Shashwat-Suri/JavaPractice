package practice;

class NewThread implements Runnable {
	Thread t;
	
	NewThread(String x){
		t=new Thread(this,x);
		System.out.println("NewThread :" +t);
		t.start();
	}
	
	public void run(){
		try {
			for(int i=5;i>0;i--){
				System.out.println("NewThread :"+i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e){
			System.out.println("NewThread was Interrupted");
		}
		System.out.println("My Thread ends");
	}
}

public class Thread2 {
	public static void main(String args[]){
		new NewThread("My Thread");
		try {
			for (int i=5;i>0;i--){
				System.out.println("MainThread :"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread was Interrupted");
		}
		System.out.println("Main Thread ends");
	}
}