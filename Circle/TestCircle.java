class Circle{
	private double radius;
	private String colour;
	
	Circle(){
		radius = 1;
		colour = "Red";
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	Circle(double radius, String colour){
		this.radius = radius;
		colour = colour;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public String getColour(){
		return colour;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public double findCircleference(){
		return 2*Math.PI*radius;
	}
	
}


class TestCircle{
	public static void main(String args[]){
		Circle c1 = new Circle(1.1, "Blue");
		System.out.println(c1);
		
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		
		Circle c3 = new Circle();
		System.out.println(c3);
		
		c2.setRadius(3.3);
		c2.setColour("Green");
		System.out.println("The radius is " + c2.getRadius());
		System.out.println("The colour is " + c2.getColour());
		
	}
}
