package Basic_programming_Model;

import Standard.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class Libaries {
    public static void main(String[] args) {
        // Standard system libraries
        // 1.Math
        System.out.println(Math.max(1, 4));
        System.out.println(Math.E+" "+Math.PI);
        System.out.println(Math.pow(2, 3)); // power: 2^3
        System.out.println(Math.exp(2)); // exponential: e^2  ,e==Math.E

        System.out.println("random="+Math.random()); // contrast to other Math library methods,
                                                     // random isn't implements mathematical function
                                                     // because it's not take an argument

        // 2. Array
        int[] list = new int[]{3,2,56,4,23,654,4,7,5};
        Arrays.sort(list); // void return, put the Array in increasing order
        System.out.println(Arrays.toString(list));

        // 3. Standard libraries: StdRandom, StdOut, StdInput...
        StdOut.printf("*************************StdRandom********************************\n");
        StdOut.println(StdRandom.random());
        StdOut.println(StdRandom.uniform(2, 100));
        StdOut.printf("%5d\n", StdRandom.uniform(2, 100));
        StdOut.println(StdRandom.bernoulli(1.0)); // bernoulli(double b)  true with probability b

        double[] doubles = new double[]{1.2, 2.3, 6.2, 5.34, 8.11, 0.2, 4.075, 45.2};
        StdRandom.shuffle(doubles);
        for(double d : doubles){
            StdOut.print(d+" ");
        }

        StdOut.printf("\n*************************StdStats********************************\n");
        StdOut.println(StdStats.max(doubles));
        StdOut.println(StdStats.min(doubles));
        StdOut.println(StdStats.mean(doubles)); //average
        StdOut.println(StdStats.var(doubles)); // simple variance (FangCha)
        StdOut.println(StdStats.stddev(doubles));

        StdOut.printf("\n*************************StdIn********************************\n");
//        int key = StdIn.readInt();
//        System.out.println(key);

        while(!StdIn.isEmpty()){
            StdOut.println(StdIn.readString()); // read a value of type String
        }
    }
}
