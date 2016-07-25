package practice;

public class Loop{
	public static void main(String args[]){
		int i,j,k;
		for(i=0;i<5;i++){
			for(k=5;k>i;k--){
				System.out.print(" ");
			}
			
			for(j=0;j<i;j++){
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
