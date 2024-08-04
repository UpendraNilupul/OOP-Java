class TestPoint{
	public static void main(String args[]){
		Point p1 = new Point(4,5);
		
		
		System.out.println(p1.distance(2,3));
		System.out.println(p1.getX());
	}
}

class Point{
	private int x;
	private int y;
	
	Point(){
		
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(int x1, int y1){
		double distance = Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
		return distance;
	}
}
