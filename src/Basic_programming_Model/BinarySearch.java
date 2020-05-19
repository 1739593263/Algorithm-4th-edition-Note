package Basic_programming_Model;

import IO.In;
import Standard.StdIn;
import Standard.StdOut;
import Standard.StdRandom;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int[] a, int key){
        int lo = 0, hi = a.length-1;
        int mid = 0;
        while(lo <= hi){
            mid = lo + (hi-lo)/2; // mid = (lo + hi)/2
            if(key < a[mid]) hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

//    public static int[] random_match(){
//        int[] r = new int[6];
//        for(int i=0;i<6;i++){
//
//        }
//    }

    public static void main(String[] args) {
        int[] list = {1,4,23,54,234,86,58,8,90,82,49,61,40,71};
        Arrays.sort(list);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
//            StdOut.println(key);
            int result = rank(list, key);
            if(result<0) StdOut.println("no result");
            else StdOut.println(result);
        }
        StdRandom.uniform();
    }
}
