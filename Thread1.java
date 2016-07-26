package practice;

public class Thread1{
	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("current thread :"+t);
		System.out.println("thread's name :"+t.getName());
		System.out.println("thread's priority :"+t.getPriority());
		System.out.println("thread group's name :"+t.getThreadGroup());
		t.setName("Shashwat");
		System.out.println("modified current thread :"+t);
		try {
			for(int i=0;i<5;i++){
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			System.out.println("The Thread.sleep() method invoked InterruptedException");
		}
		
	}
}
