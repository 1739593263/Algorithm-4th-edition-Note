package Basic_programming_Model.ADT;

import Standard.StdDraw;

public class VisualAccumulator {
    private int N;
    private double total;

    public VisualAccumulator(int trials, double max){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(0.005);
    }

    public void addDataValue(double val){
        N++;
        total+=val;

        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,mean(total,N));
    }

    public double mean(Double t,int N){
        return t/N;
    }
}
