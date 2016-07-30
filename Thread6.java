package practice;

class Q {
	int n;
	boolean valueSet = false;
	synchronized public void  getn(){
		while(valueSet==false){
			try{
				wait();
			} catch(InterruptedException e){
				System.out.println("getn interrupted");
			}
		}
		System.out.println("GOT n:"+n);
		valueSet=false;
		notify();
	}
	synchronized public void putn(int n){
		while(valueSet==true){
			try{
				wait();
			} catch(InterruptedException e) {
				System.out.println("putn interrupted");
			}
		}
		System.out.println("PUT n:"+n);
		valueSet=true;
		notify();
		this.n=n;
	}
	Q(int n){
		this.n=n;
	}
}

class ProduceN implements Runnable {
	Q q;
	Thread t;
	ProduceN(Q q){
		this.q=q;
		t=new Thread(this);
		t.start();
	}
	
	public void run(){
		for(int i=1;i<5;i++){
			q.putn(i);
		}
	}
}

class ConsumeN implements Runnable {
	Q q;
	Thread t;
	ConsumeN(Q q){
		this.q=q;
		t=new Thread(this);
		t.start();
	}
	
	public void run(){
		for(int i=1;i<5;i++){
			q.getn();
		}
	}
}

public class Thread6 {
	public static void main(String args[]){
		Q q=new Q(1);
		ConsumeN consumeN = new ConsumeN(q);
		ProduceN produceN = new ProduceN(q);
		
		
	}
}