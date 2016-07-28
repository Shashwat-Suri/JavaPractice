package practice;

class MultipleThreads2 implements Runnable {
	Thread t;
	String name;
	MultipleThreads2(String x){
		t=new Thread(this,x);
		name=x;
		t.start();
		System.out.println(name+" started");
	}
	
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			} 
		}catch(InterruptedException e){
				System.out.println(name+" interrupted");
			}
		
	}
}

public class Thread5 {
	public static void main(String args[]){
		MultipleThreads2 newThread1 = new MultipleThreads2("New Thread 1");
		MultipleThreads2 newThread2 = new MultipleThreads2("New Thread 2");
		MultipleThreads2 newThread3 = new MultipleThreads2("New Thread 3");
		
		System.out.println(newThread1.t.isAlive());
		System.out.println(newThread2.t.isAlive());
		System.out.println(newThread3.t.isAlive());
		
		try{
			newThread1.t.join();
			newThread2.t.join();
			newThread3.t.join();
		} catch(InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		
		System.out.println(newThread1.t.isAlive());
		System.out.println(newThread2.t.isAlive());
		System.out.println(newThread3.t.isAlive());
	}
}