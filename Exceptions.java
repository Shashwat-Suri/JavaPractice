package practice;

class NewException extends Exception {
	private static final long serialVersionUID = 1L;
	
	NewException(){
		System.out.println("exception's constructor");
	}
	
	public String toString(){
		return "My Exception 1";
	}
}

public class Exceptions {
	
	
	public static void main (String args[]){
		
		try{
			throw new NewException();
			
		}
		catch(NewException e){
			System.out.println("done:"+e);
		}
	}
		
}