package Basic_programming_Model.exercise.abstractT;

import Standard.StdIn;

import java.util.Scanner;

public class Interval1D {
    private static class Interval{
        public double a;
        public double b;
        public Interval(double a, double b){
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();

        Interval[] intervals = new Interval[N];
        for(int i=0; i<N; i++){
            double a = StdIn.readDouble();
            double b = StdIn.readDouble();
            intervals[i] = new Interval(a,b);
        }

        for(int i=0;i<N;i++){
            for(int j=0; j<i; j++){
                Interval i1 = intervals[j];
                Interval i2 = intervals[i];
                if(i1.b>i2.a && i1.b<i2.b){
                    System.out.println("i1:"+i1.a+","+i1.b+" i2:"+i2.a+","+i2.b);
                }else if(i1.a>i2.a && i1.a<i2.b){
                    System.out.println("i1:"+i1.a+","+i1.b+" i2:"+i2.a+","+i2.b);
                }
            }
        }
    }
}
