package Basic_programming_Model.exercise;

public class dice_simulating {
    public static double[] ex_result(){
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for(int i=1; i<=SIDES;i++){
            for(int j=1;j<=SIDES;j++){
                dist[i+j]+=1.0;
            }
        }
        for(int k=2;k<=2*SIDES;k++){
            dist[k]/=36.0;
        }
        return dist;
    }

    public static void main(String[] args) {
        double[] doubles = ex_result();
        int i =0;
        for (double d:doubles){
            i++;
            System.out.println(i+" "+d);
        }

    }
}
