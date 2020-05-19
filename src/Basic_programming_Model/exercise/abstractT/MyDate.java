package Basic_programming_Model.exercise.abstractT;

import Standard.StdIn;
import Standard.StdOut;

public class MyDate extends Date {

    protected MyDate(int month, int day, int year) {
        super(month, day, year);
    }

    public static void main(String[] args) {
        String s = StdIn.readAll();
        String[] si = new String[s.length()];
        si = s.split("\\s+");

        for (int i=0;i<s.length();i++){
            System.out.println(si[i]);
        }
    }
}
