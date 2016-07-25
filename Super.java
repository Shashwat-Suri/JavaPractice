package practice;

class SuperClass {
	public int i;
	private int j;
	
	SuperClass (){
		i=0;
		j=0;
			
	}
	
	SuperClass(SuperClass x){
		i=x.i;
		j=x.j;
		
	}
	
	SuperClass(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	void superShow(){
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}

class SubClass extends SuperClass {
	int k;
	SubClass(){
		super();
		k=0;
	}
	
	SubClass(int i,int j,int k){
		super(i,j);
		this.k=k;
	}
	
	SubClass(SuperClass x,int k){
		super(x);
		this.k=k;
	}
	
	void subShow(){
		
		super.superShow();
		System.out.println("k="+k);
	}
	
}

public class Super {
	
	public static void main(String args[]){
		SuperClass superClass = new SuperClass(3,5);
		superClass.superShow();
		
		SubClass subClass = new SubClass(superClass,7);
			subClass.subShow();
		}
}
