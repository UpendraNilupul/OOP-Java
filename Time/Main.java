package Time;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(58,30,3);
        time1.nextSecond().nextSecond().nextSecond();
        System.out.println(time1);
    }
    
}
