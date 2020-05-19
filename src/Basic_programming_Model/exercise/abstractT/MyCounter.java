package Basic_programming_Model.exercise.abstractT;

import Standard.StdRandom;

import java.util.Scanner;

public class MyCounter {

    public static class VisualCounter{
        int N;
        int max;
        int ii = 0;
        public VisualCounter(int N, int max){
            this.N = N;
            this.max = max;
        }

        public int increase(int counter){
            if(counter+1<=max){
                ii++;
                if(ii<N){
                    counter++;
                    System.out.println("counterNow="+counter+" times:"+ii);
                }else {
                    System.out.println("over N");
                }
            }else {
                System.out.println("over max counter");
            }

            return counter;
        }

        public int decrease(int counter){
            if(counter-1>=0-max){
                ii++;
                if(ii<N){
                    counter--;
                    System.out.println("counterNow="+counter+" times:"+ii);
                }else {
                    System.out.println("over N");
                }
            }else {
                System.out.println("over max counter");
            }

            return counter;
        }
    }

    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int max = new Scanner(System.in).nextInt();
        int counter = 0;

        VisualCounter vc = new VisualCounter(N,max);

        for(int i =0;i<6;i++){
            int h = StdRandom.uniform(0,2);  // [0,2)
            if(h==0){
                counter = vc.decrease(counter);
            }else if(h==1) counter = vc.increase(counter);
        }
    }
}
