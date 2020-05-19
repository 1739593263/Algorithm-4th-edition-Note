package Basic_programming_Model.exercise;

import Standard.StdOut;
import Standard.StdRandom;

public class two_dimensional_array {
    public static void main(String[] args) {
        boolean[][] a = new boolean[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = (Math.random()*30+1 > 15);
                if(a[i][j]) StdOut.print(i+"-"+j+":*");
                else StdOut.print(i+"-"+j+": ");
                if(!(i==4 && j==4)) StdOut.print(",");
            }
        }
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                if(a[i][j]) StdOut.print("*,");
//                else StdOut.print(" ,");
//            }
//        }
    }
}
