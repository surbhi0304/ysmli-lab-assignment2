package day2assignments;

public class Circle {
	private double radius=1.0;
	private String color= "red";
	
	Circle(){ 
		
	}
	
	Circle(double r){
		radius=r; 
	}
	
	public double getradius() {
		return radius;
	}
	
	public double getArea() {
		return(3.14*radius*radius);
	}
	
	}


