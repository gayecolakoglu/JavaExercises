public class MyTime {
    private int hour,minute;
    public MyTime(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    public String toString(){
        return (hour<10? "0":"")+hour +":"+(minute<10? "0":"")+minute;
    }

    public int incrementHour() {
        return incrementHour(1);
    }

    public int incrementHour(int value) {
        int dayDiff=(hour+value)/24;
        int newHour=(hour+value)%24;
        if((hour+value)<0){
            dayDiff--;
            newHour+=24;
        }
        this.hour=newHour;
        return dayDiff;
    }


    public int incrementMinute(int value) {
        int hourDiff=(minute+value)/60;
        int newMinute=(minute+value)%60;
        if((minute+value)<0){
            hourDiff--;
            newMinute+=60;
        }
        this.minute=newMinute;
        return incrementHour(hourDiff);
    }
    public int minuteDifference(MyTime anothertime){
        return Math.abs((this.hour*60+this.minute)-(anothertime.hour*60+anothertime.minute));
    }
}
