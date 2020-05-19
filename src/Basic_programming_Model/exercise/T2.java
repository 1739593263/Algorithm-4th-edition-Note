package Basic_programming_Model.exercise;

import Standard.StdOut;

public class T2 {
    public static void main(String[] args) {
//        double t = 9.0;
//        while(Math.abs(t - 9.0/t)>.001){
//            t=(9.0/t+t)/2.0;
//        }
//        StdOut.println(t);
        int sum = 0;
        for(int i =0; i<1000;i++){
            for(int j=0; j<i; j++){
                sum++;
            }
        }
        System.out.println(sum);
        System.out.println((char)'a'+4);

        System.out.println('b'+'c');
        System.out.println('b');
    }
}
