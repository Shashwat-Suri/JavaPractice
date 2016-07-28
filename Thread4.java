package practice;


class MultipleThreads implements Runnable {
	Thread t;
	String name;
	MultipleThreads(String x){
		name=x;
		t=new Thread(this,name);
		System.out.println("New Thread "+x+" initiated");
		t.start();
		
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println(name+" was interrupted!");
		}
		System.out.println(name+" has ended");
	}
}

public class Thread4 {
	public static void main(String args[]){
		new MultipleThreads("My Thread 1");
		new MultipleThreads("My Thread 2");
		new MultipleThreads("My Thread 3");
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main thread :"+i);
				Thread.sleep(3000);
			}
		} catch(InterruptedException e){
			System.out.println("Main thread was interrupted!");
		}
		System.out.println("Main thread has ended");
	}
}