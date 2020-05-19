package Basic_programming_Model.exercise;

import Standard.StdIn;
import Standard.StdRandom;

public class shuffleTest {
    public static void shuffle(double[] a){
        int[] b = new int[a.length];
        for(int i=0;i<a.length;i++){
            int r = StdRandom.uniform(0,a.length-1);
            double temp = a[i];
            a[i]=a[r];
            a[r]=temp;

            b[i]++; b[r]++;
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }


    public static void main(String[] args) {
        int M = StdIn.readInt();
        double[] a = new double[M];
        int N = StdIn.readInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                a[j]=j;
            }
            shuffle(a);
            System.out.println();
        }
    }
}
