package Basic_programming_Model;

import Standard.StdDraw;

public class Std_libraries2 {
    public static void main(String[] args) {
        StdDraw.setPenColor(StdDraw.GREEN);

        // every position arguments in StdDraw must be double, nor the picture will located out of canvas.
        StdDraw.point(0.1,0.1);
        StdDraw.line(0,0,2,6);
        StdDraw.circle(0.5,0.5,0.2);
        StdDraw.square(0.7,0.6,0.3);

        double[] x = {0.1,0.3,0.7,0.9};
        double[] y = {0.3,0.5,0.1,0.0};
        StdDraw.polygon(x,y);

        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.ellipse(0.1,0.5,0.7,0.38);
        StdDraw.arc(0.3,0.6,0.4,0.15,0.5);
        StdDraw.text(0.5,0.5,"Just a messy Draw");
//        StdDraw.setCanvasSize(1000,1000);
    }
}
