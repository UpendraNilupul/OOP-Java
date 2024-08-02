public class TestDate{
	public static void main(String args[]){
		Date d1 = new Date(1980,5,23);
		
		
		System.out.println("Year = " + d1.getYear());
		System.out.println("Month = " + d1.getMonth());
		System.out.println("Day = " + d1.getDay());
		
		Date d2 = new Date(2012, 11, 3);
		d2.setDate(2011,12,12);
		System.out.println(d2.getDay());
	}
}

class Date{
	private int year;
	private int month;
	private int day;
	
	Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public void setMonth(int month){
		this.month = month;
	}
	
	public void setDay(int day){
		this.day = day;
	}
	
	public void setDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
}