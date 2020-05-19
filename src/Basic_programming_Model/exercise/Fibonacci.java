package Basic_programming_Model.exercise;

public class Fibonacci {
    public static void F1(){
        int f = 0, g = 1;
        for(int i=0; i<15; i++){
            System.out.print(f+" ");
            f = f +g;
            g = f -g;
        }
    }

    // F2(N) = F2(N-1) + F(n-2) ...
    // F2(N-1) = F2(N-2) + F2(N-3)     F2(N-2) = F2(N-3) + F2(N-4) ...
    public static int F2(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return F2(N-1) + F2(N-2);
    }

    public static void main(String[] args) {
        F1();
        System.out.println();
        for(int i = 0; i<15; i++){
            System.out.print(F2(i)+" ");
        }
    }
}
