package Basic_programming_Model.exercise.abstractT;

import Standard.StdOut;

import java.util.Scanner;

public class rotationCir {

    private static void rotation(String s1, String s2){
        int l = s1.length();
        String s22 = String.valueOf(new StringBuffer(s2).reverse());
        char[] sc1 = new char[l];
        char[] sc2 = new char[l];
        char[] sc22 = new char[l];
        int index = 0;
        int index1 = 0;

        sc1 = s1.toCharArray();
        sc2 = s2.toCharArray();
        sc22 = s22.toCharArray();

//        for(int i =0;i<l;i++){
//            for(int j=0;j<l;j++){
//                if(sc1[i]==sc2[j]){
//                    sc2[j]=0;
//                    index++;
//                    break;
//                }
//            }
//        }
        int gap = 0;
        int gap1 = 0;

        // anticlockwise
        for(int i=0;i<l;i++){
            if(i==0){
                gap = s22.indexOf(sc1[i])+1;
            }

            int in= Math.abs(i-gap);

            if(sc1[i]==sc2[in]){
                index++;
            }else if ((in-1)>=0 && sc1[i]==sc22[in-1]){
                index++;
            }else break;
        }

        // clockwise
        for(int i=0;i<l;i++){
            if(i==0){
                gap1 = s2.indexOf(sc1[i]) - s1.indexOf(sc1[i]);
            }

            int in1 = i+gap1;

            if(in1<(l-1) && sc1[i]==sc2[in1]){
                index1++;
            }else if (in1>(l-1) && sc1[i] == sc2[in1-l-1]){
                index1++;
            }else break;
        }

        System.out.println(index);
        if(index == l || index1 == l){
            System.out.println("matched");
        }
    }

    public static void main(String[] args) {
       String s1 = new Scanner(System.in).next();
       String s2 = new Scanner(System.in).next();

       int l1 = s1.length();
       int l2 = s2.length();
       assert l1>3 && l1<8:"test assert--it is illegal";

       if (l1 == l2){
           rotation(s1,s2);
       }
    }
}
