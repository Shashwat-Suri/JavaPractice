package practice;

interface Vehicle {
	void start();
	void stop();
}

class Car implements Vehicle {
	public void start(){
		System.out.println("the car has started");
	}
	
	public void stop(){
		System.out.println("the car has stopped");
	}
}

class Bike implements Vehicle {
	public void start(){
		System.out.println("the bike has started");
	}
	
	public void stop(){
		System.out.println("the bike has stopped");
	}
}

public class Interfaces {
	public static void main (String args[]){
		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.stop();
		Bike bike = new Bike();
		vehicle=bike;
		vehicle.start();
		vehicle.stop();
		
	}
}