package Basic_programming_Model.exercise;

import Standard.StdIn;
import Standard.StdOut;

public class Tt {
    public static void main(String[] args) {
        StdOut.println(Math.abs(-2147483648));
//        +" 1.0/0.0="+1.0/0.0
        StdOut.println("1.0/0.0 = "+1.0/0.0);
        StdOut.println(10^6);  // 1010 ^ 0110 = 1100 = 12  Bitwise calculate !
        StdOut.println(10&6);  // 1010 & 0110 = 1110 =14  Bitwise calculate &&
//        int i;
//        for(i=0;i<3;i++){
//            System.out.println(i);
//        }
//        System.out.println("i="+i);

        System.out.println((0 + 15)/2);
        System.out.println(2.0e-6*100000000.1); // *
        System.out.println(Math.E);
        System.out.println(true && false || true && true);

        System.out.println(1+2+"3"+3);

//        int[] x = new int[3];
//        for(int i = 0; i<3; i++){
//            x[i] = StdIn.readInt();
//        }
//        if((x[0] == x[1])&&(x[0] == x[2])&&(x[1] == x[2])){
//            System.out.println("equal");
//        }else{
//            System.out.println("not equal");
//        }

        System.out.println("*******************************斐波那契数列（Fibonacci sequence）************************************");
        int f =0, g=1;
        for(int i=0; i<=15; i++){
            StdOut.print(f+" ");
            f = f + g;
            g = f - g;
        }
    }
}
