package Time;

public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;  


    Time(){

    }

    Time(int second, int minute, int hour){
        if (second<=59 && minute<=59 && hour<24) {
            this.second = second;
            this.minute = minute;
            this.hour = hour;
        }
        else{
            System.out.println("Error");
        }
        
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSeond(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public String toString(){
        return "Time = " + this.hour + ":" + this.minute + ":" + this.second;
    }

    public Time nextSecond(){
        if(this.second>=59){
            this.minute++;
            this.second = 00;
            if(this.minute>59){
                this.hour++;
                this.minute = 00;
            }
        }
        else{
            this.second++;
        }
        return this;
    }

}


