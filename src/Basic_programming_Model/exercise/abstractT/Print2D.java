package Basic_programming_Model.exercise.abstractT;

import Standard.StdRandom;

import java.awt.*;
import java.util.Scanner;

public class Print2D {
    private static class Point{
        public double x;
        public double y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

    }

    public static double distance(Point a, Point b){
        double d;
        double dpow = Math.pow(a.x,a.y)+Math.pow(b.x,b.y);
        d = Math.sqrt(dpow);
        return d;
    }

    public static void main(String[] args) {
        int N;
        N = new Scanner(System.in).nextInt();
        Point[] ps = new Point[N];
        double min = 0;
        for(int i=0;i<N;i++){
            double x = StdRandom.uniform(0.0,1.0);
            double y = StdRandom.uniform(0.0,1.0);
            Point point = new Point(x,y);
            ps[i]=point;
            for(int j =0;j<i;j++){
                double now = distance(ps[j],ps[i]);
                if(j==0 && i==1){
                    min = now;
                }else{
                    if(now < min){
                        min = now;
                    }
                }
            }
        }
        System.out.println("min = "+min);

    }
}
