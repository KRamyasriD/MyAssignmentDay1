package Day1Assignment;

public class car {

	//Week1-day1 Assignment:
	//	=====================
	//	    a)Create a class by name : Car
	//		b)Create a method 
	//	  driveCar->Have a print statement
	//  applyBrake->Have a print statement
	//soundHorn->Have a print statement
    //isPuncture->Have a print statement
	//		c)Create a main method 
	//		d)Create an Object
	//		e)Call the methods using the object
	//		f)Run and Confirm

	public void driveCar() {
		System.out.println("Start the car");
	}
	
	public String applyBreak() {
		return "Click on Break";	
	}
	public void soundHorn() {
		System.out.println("Click on Sound Horn Button");
		
	}
	
	public String isPuncture() {
		return "Check tire puncture";
		
	}
	public static void main(String[] args) {
		
		car obj1= new car();
	
		obj1.driveCar();
		
		String applyBreak = obj1.applyBreak();
		System.out.println(applyBreak);
		
		obj1.soundHorn();
	    
		String isPuncture = obj1.isPuncture();
		System.out.println(isPuncture);
		
		

		
	}



	
}
