package Basic_programming_Model.exercise;

import Basic_programming_Model.BinarySearch;
import Standard.StdIn;
import Standard.StdOut;

import java.util.ArrayList;
import java.util.Arrays;

public class T4 {
    public static void dividing(){
        ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
        while(!StdIn.isEmpty()){
            Object[] objects = new Object[4];
            String str = StdIn.readString();
            Integer x1 = StdIn.readInt();
            Integer x2 = StdIn.readInt();
            double d = x1/x2;

            objects[0] = str;
            objects[1] = x1;
            objects[2] = x2;
            objects[3] = d;

            arrayList.add(objects);
        }
        StdOut.println("|name|     |int1|     |int2|     |dividing|");
        for(Object[] obj: arrayList){
            System.out.print(obj[0]+"     "+obj[1]+"     "+obj[2]+"     ");
            StdOut.printf("%.3f",obj[3]);
        }
    }

    public static int rank(int lo, int hi, int[] a, int key){
        if(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(key < a[mid]) return rank(lo,mid-1,a,key);
            else if(key > a[mid]) return rank(mid+1,hi,a,key);
            else return mid;
        }
        return -1;
    }

    public static int[] rank1(int[] a, int key){
        int lo = 0, hi = a.length-1;
        int mid=0;
        if(key > 0){
            while(lo<=hi){
                mid = (lo+hi)/2;
                if(key < a[mid]) hi = mid-1;
                else if(key > a[mid]) lo = mid+1;
                else{
                    break;
                }
            }

            int[] below = new int[mid+1];
            for(int i=0;i<=mid;i++){
                below[i]=a[i];
            }
            return below;
        }
        else return null;
    }

    public static int count(int[] a, int key){
        int lo = 0, hi = a.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(key>a[mid]) lo = mid +1;
            else if(key<a[mid]) hi = mid -1;
            else{
                lo = mid;
                hi = mid;
                int num = 1;
                while(a[lo]==key || a[hi]==key){
                    if(lo>=1) {
                        lo--;
                        if(a[lo]==key){
                            num++;
                        }
                    }else if(a[hi]!=key){
                        break;
                    }

                    if(hi<=a.length-2) {
                        hi++;
                        if(a[hi]==key){
                            num++;
                        }
                    }else if(a[lo]!=key){
                        break;
                    }

                }
                return num;
            }
        }
        return 0;
    }

    public static void BinarySearch(){
        int[] list = {1,4,23,54,234,86,58,8,90,82,49,61,40,71,4,49,58,6,8,58};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
//            StdOut.println(key);
            int result = rank(0,list.length-1, list, key);
            if(result<0) StdOut.println("no result");
            else StdOut.println(result);

            // rank1
            int[] result1 = rank1(list,key);
            for(int i : result1){
                System.out.print(i+" ");
            }

            //count
            System.out.println("\n"+count(list,key)+" SAME NUMS");
        }

    }

    // get the Great Common divisor
    public static int GCdivisor(int q, int p){
        if(q!=0 &&p!=0){
            if(q%p == 0) return p;
            else return GCdivisor(p,q%p);
        }else if(q==0&&p!=0) return p;
        else if(q!=0&&p==0) return q;
        else return 0;
    }

    public static void relaPrimeArr(){
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                a[i][j] = GCdivisor(i, j)==1? true:false;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    // return (1.0-p) + p
    public static double binomal(int N, int k, double p){
        if(N==0 || k<0) return 1.0;
        return (1.0-p)*binomal(N-1, k, p) + p*binomal(N-1, k-1, p);
    }

    public static void main(String[] args) {
//        dividing();
//        BinarySearch();
//        System.out.println(GCdivisor(12,60));
//        System.out.println(binomal(5,4,0.25));
        relaPrimeArr();

    }
}
