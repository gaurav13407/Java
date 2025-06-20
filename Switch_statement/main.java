public class main {
    public static void main(String[] args){
        int day=1;
        String dayName;

        switch(day){
            case 1:
            dayName="Monday";
            break;
            case 2:
            dayName="Tuesday";
            break;
            case 3:
            dayName="wednesday";
            break;
            case 4:
            dayName="Thrusaday";
            break;
            case 5:
            dayName="Friday";
            break;
            case 6:
            dayName="Saturday";
            break;
            case 7:
            dayName="Sunday";
            break;
            default :
            dayName="NA";
        }
        System.out.println("Today is:"+dayName);
    }
}
