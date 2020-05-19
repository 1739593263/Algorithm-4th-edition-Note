package Basic_programming_Model.exercise;

import Standard.StdIn;

public class T3 {
    public static void lg(){
        int N = 0;
        N = StdIn.readInt();
        int j = 0;
        for(int i =N;i>=2;i/=2){
            j++;
        }
        System.out.println(j);
    }

    public static int[] histogram(){
        int[] a = new int[]{1,5,3,7,5,7,3,2,4,7,3,2,0,6};
        int M = StdIn.readInt();
        int[] b = new int[M];
        for(int i=0;i<M;i++){
            int c = 0;
            for(int j=0;j<a.length;j++){
                if(i==a[j]) c++;
            }
            b[i]=c;
        }
        return b;
    }

    // careful about the return value is "String"
    public static String exR1(int n){
        if(n<=0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    public static String exR2(int n){
        String s = exR2(n-3)+n+exR2(n-2)+n;
        if(n<=0) return "";
        return s;
    }

    public static int mystery(int a, int b){
        if(b == 0) return 0;
        if(b%2 == 0) return mystery(a+a,b/2);
        return mystery(a+a, b/2)+a;
    }

    public static int mysteryStar(int a, int b){
        if(b == 0) return 1;
        if(b%2 == 0) return mysteryStar(a*a,b/2);
        return mysteryStar(a*a, b/2)*a;
    }

    public static int In(int N){
        if(N == 0) return 0;
        return In((int) (N/Math.E))+1;
    }

    public static void main(String[] args) {
//        lg();
//        int[] b = histogram();
//        for(int i=0;i<b.length;i++){
//            System.out.println(b[i]);
//        }
//        System.out.println("exR1(6)="+exR1(6));
//        System.out.println("exR2(6)="+exR2(6));
        System.out.println(mystery(3,11));
        System.out.println(mysteryStar(2,5));
        System.out.println(In(100));
    }
}
