package practice;

class StopResume implements Runnable {
	Thread t;
	String name;
	boolean flag;
	StopResume(String name){
		this.name=name;
		t=new Thread(this,name);
		flag=false;
		System.out.println(name+" started");
		t.start();
	}
	
	public void run(){
		try{
			for(int i=15;i>0;i--){
				System.out.println(name+":"+i);
				Thread.sleep(200);
				synchronized(this){
					while(flag==true){
						wait();
					}
				}
			}
		} catch(InterruptedException e){
			System.out.println(name+" interrupted");
		}
		System.out.println(name+" exiting");
	}
	
	synchronized void mySuspend(){
		flag=true;
	}
	
	synchronized void myResume(){
		flag=false;
		notify();
	}
}

public class Thread7 {
	public static void main(String args[]){
		StopResume ob1 = new StopResume("OB1");
		StopResume ob2 = new StopResume("OB2");
		try{
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println(ob1.name+" suspended");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println(ob1.name+" resumed");
			Thread.sleep(1000);
			ob2.mySuspend();
			System.out.println(ob2.name+" suspended");
			Thread.sleep(1000);
			ob2.myResume();
			System.out.println(ob2.name+" resumed");
			ob1.t.join();
			ob2.t.join();
			
		} catch(InterruptedException e) {
			System.out.println("Threads Interrupted");
		}
		System.out.println(Thread.currentThread().getName()+"exiting");
	}
}

















