package practice;

class Box{
	public int height,width,length;
	public void volume(){
		System.out.println("The volume of the box is "+(height*width*length));
	}
}

public class BoxDemo{
	
	static public void main(String args[]){
		Box newBox= new Box();
		newBox.height=10;
		newBox.width=10;
		newBox.length=10;
		newBox.volume();
		
	}

}
