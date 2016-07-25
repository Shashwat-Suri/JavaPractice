package practice;

class ThisClass{
	int height,width,length;
	
	ThisClass(int height,int width,int length){
		this.height=height;
		this.width=width;
		this.length=length;
	}
	
	ThisClass(ThisClass x){
		height=x.height;
		width=x.width;
		length=x.length;
	}
	
	void print(){
		System.out.println("height: "+height);
		System.out.println("width:  "+width);
		System.out.println("length: "+length);
	}
	
}

public class This {
	public static void main(String args[]){
		ThisClass newClass = new ThisClass(12,13,14);
		newClass.print();
		ThisClass newClass2 = new ThisClass(newClass);
		newClass2.print();
	}
}
