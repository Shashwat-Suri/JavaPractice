package practice;

public class ForLoop {
	public static void main(String args[]) throws java.io.IOException{
		int num[];
		num=new int[12];
		
		
		for(int i=0;i<12;i++){
			num[i]=i*2;
			
		}
		
		for(int x:num){
			System.out.println(x);
		}
	}
}