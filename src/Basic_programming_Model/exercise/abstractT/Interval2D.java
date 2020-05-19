package Basic_programming_Model.exercise.abstractT;

import Standard.StdDraw;
import Standard.StdIn;
import Standard.StdRandom;

import java.util.Scanner;

public class Interval2D {
    private static class Point{
        public double x;
        public double y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }

    private static class Interval{
        public Point a;
        public Point b;
        public Interval(Point a, Point b){
            this.a = a;
            this.b = b;
        }
    }

    private static void Draw(Interval interval){
        double x0 = interval.a.x, y0 = interval.a.y;
        double x1 = interval.b.x, y1 = interval.b.y;
        StdDraw.line(x0,y0,x1,y1);
    }

    private static boolean intersection(Interval i1, Interval i2){
        double s1 = (i2.b.x - i1.a.x)*(i1.b.y-i1.a.y) - (i2.b.y-i1.a.y)*(i1.b.x-i1.a.x);
        double s2 = (i2.a.x - i1.a.x)*(i1.b.y-i1.a.y) - (i2.a.y-i1.a.y)*(i1.b.x-i1.a.x);

        if(s1<0 || s2<0){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        int N = Integer.parseInt(args[2]);
        double max = Double.parseDouble(args[1]),min= Double.parseDouble(args[0]);
//        assert max>min&&max<=1:"illegal max";
//        assert min>=0&&min<max:"illegal min";

        Interval[] intervals = new Interval[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            double x0 = StdRandom.uniform(min,max);
            double y0 = StdRandom.uniform(min,max);
            double x1 = StdRandom.uniform(min,max);
            double y1 = StdRandom.uniform(min,max);
            Point a = new Point(x0,y0);
            Point b = new Point(x1,y1);

            Interval interval =  new Interval(a,b);
            intervals[i]=interval;
            Draw(interval);
            for(int j=0;j<i;j++){
                if(intersection(intervals[j],intervals[i])){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);
    }

}
