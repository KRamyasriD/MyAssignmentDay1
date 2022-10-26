package ramWeek1.Day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SecondCode {
	
	public void sayHello() {
		
		System.out.println("hello Jackson");
		
	}
	
	public int getzipCode() {
		return 12345;
				
	}
	
	public String getzipColor() {
		return "Test Color"; 
				
	}
	
	public static void main(String[] args) {
			//Create an Object 
		
		SecondCode obj=new SecondCode(); 

		
	//Call method using object created 
		//ctrl+2 -->1 
		obj.sayHello();
        
	obj.getzipCode();
	
		 
		String getzipColor = obj.getzipColor(); 
		
		System.out.println(getzipColor);
		
		
	}

	
		
	}
	
	

