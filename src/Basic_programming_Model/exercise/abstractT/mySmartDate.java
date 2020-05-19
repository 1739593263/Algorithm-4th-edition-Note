package Basic_programming_Model.exercise.abstractT;

import IO.In;

import java.util.Date;
import java.util.Scanner;

public class mySmartDate {
    private final static int[]GCalender = new int[]{4,2,0,6,4,2,0};
    private final static String[] Weeks = new String[]{"Sunday","Monday","Tuesday",
                                                        "Wednesday","Thursday","Friday",
                                                        "Saturday"};

    private static class SmartDate extends Exception{
        String date;

        public SmartDate(String date)throws Exception{
            if(!ifLegal(date)){
                throw new Exception("illegal date");
            }else{
                this.date = date;
                System.out.println(dayOfWeek(date));
            }
        }

        public static void hh(){
            System.out.println("hh");
        }
    }

    private static boolean ifLegal(String s){
        String[] date = s.split("/");
        int month = Integer.parseInt(date[0]);
        int day = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        // according to the "Gregorian Calender"
        if (year>=1700 && year<=2300){
            if(month>=1 && month<=12){
                if(month==2){
                    if (year%4==0){
                        if (day>0 && day<=29) return true;
                        return false;
                    } else {
                        if (day>0 && day<=28) return true;
                        return false;
                    }
                }else if (month%2==1){
                    if (day>0 && day<=31) return true;
                    return false;
                }else {
                    if (day>0 && day<=30) return true;
                    return false;
                }
            }else return false;
        }else return false;

    }

    private static String dayOfWeek(String date){
        String[] dates = date.split("/");
//        for(int i=0;i<3;i++){
//            System.out.println(dates[i]);
//        }
        int yCode = YearCode(dates[2]);
        int nCode = Integer.parseInt(dates[0]);
        int cCode = CenturyCode(dates[2]);
        int dCode = Integer.parseInt(dates[1]);
        int i = Mod(yCode+nCode+cCode+dCode, 7);
        return Weeks[i];
    }

    private static Integer YearCode(String year){
        String yy = year.substring(2,4);
        int iyy = Integer.parseInt(yy);
        int rem = iyy/4;
        int res = Mod(iyy+rem,7);
        return res;
    }

    private static Integer CenturyCode(String year){
        String cen = year.substring(0,2);
        int i = Integer.parseInt(cen)-17;
        return GCalender[i];
    }

    private static Integer Mod(int time, int beMod){
        if(time>beMod*10){
            time = Mod(time-70,beMod);
        }
        return time%7;
    }

    public static void main(String[] args) {
        Date date = new Date();
        int day = new Scanner(System.in).nextInt();
        int month = new Scanner(System.in).nextInt();
        int year = new Scanner(System.in).nextInt();
        String s = day+"/"+month+"/"+year;
        SmartDate.hh();
        try {
            SmartDate sd = new SmartDate(s);
            System.out.println(sd.date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
