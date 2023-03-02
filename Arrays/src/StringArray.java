import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String[] daysOfWeek = {"Mon", "Tue", "wed", "thurs", "fri", "sat", "sun"};
//        System.out.println(Arrays.toString(daysOfWeek));
        //or we can print them like this
        for(int i = 0 ; i < daysOfWeek.length; i++){
            System.out.print(daysOfWeek[i] + " ");
        }

        System.out.println();
        String dayWithMostCh = "";

        for(String day:daysOfWeek){
            if(day.length()> dayWithMostCh.length()){
                dayWithMostCh = day;
            }
        }
        //alternate method using traditional for loop
//        for(int i = 0 ; i < daysOfWeek.length;i++){
//            if(daysOfWeek[i].length()> dayWithMostCh.length()){
//                dayWithMostCh = daysOfWeek[i];
//            }
//        }
        System.out.println("dayWithMostCh :  " + dayWithMostCh);

        //print days of week in reverse
        for (int i = daysOfWeek.length -1 ; i >= 0 ; i--){
            System.out.print(daysOfWeek[i] + " ");
        }
    }
}
