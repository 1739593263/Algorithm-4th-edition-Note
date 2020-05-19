package Basic_programming_Model.exercise;

import Basic_programming_Model.ADT.VisualAccumulator;
import Standard.StdOut;
import Standard.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T,1.0);
        for(int t=0;t<T;t++){
            a.addDataValue(StdRandom.random());
        }
        StdOut.print(a);
    }
}