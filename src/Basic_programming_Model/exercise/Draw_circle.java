package Basic_programming_Model.exercise;

import Standard.StdDraw;
import Standard.StdIn;
import Standard.StdRandom;

import java.awt.*;
/*
     Random connections. Write a program that takes as command-line arguments
     an integer N and a double value p(between0 and 1), plots N equally spaced
     dots of size .05 on the circumference of circle, and then with
     probability p for each pair of points, draws a gray line connecting them.
 */
public class Draw_circle {
    public static void main(String[] args) {

        Integer N=5, a=2;
        double p,r=a/Math.PI/2;
        StdDraw.setPenColor(Color.gray);
        StdDraw.circle(0.5,0.5,r);
        for(int i=0;i<N;i++){
            StdDraw.point(0.5-r,0.5);
        }

        StdDraw.line(0.1,0.1,0.95,0.1);
        StdDraw.line(0.1,0.1,0.1,0.95);

        for(int i=1; i<=9; i++){
            double di = i*0.1;
            StdDraw.text(0.05,di,(i-1)*10+"");
            StdDraw.text(di,0.05,(i-1)*10+"");
            double d = StdRandom.uniform(0.1, 0.45);
            System.out.println(d);
            if(i>1) StdDraw.filledRectangle(di, d, 0.025,d-0.1);
        }
    }
}
