package Basic_programming_Model.exercise;

public class Matrix {
    // vector dot product
    public static double dot(double[] x, double[] y){
        double res = 0.0;
        if(x.length == y.length){
            for(int i=0;i<x.length;i++){
                res += x[i]*y[i];
            }
        }
        return res;
    }

    // matrix-matrix product
    public static double[][] mult(double[][] a, double[][] b){
        int t = a.length<b.length? a.length:b.length;

        double[][] product = new double[t][t];
        for(int i=0; i<a.length; i++){
            for(int c=0; c<b[i].length; c++){
                int res = 0;
                for(int j=0; j<a[i].length; j++){
                    res += a[i][j]*b[j][c];
                }
                product[i][c] = res;
            }
        }

        return product;
    }

    // transpose
    public static double[][] transpose(double[][] a){
        if(a.length==a[0].length){
            for(int i=0; i<a.length; i++){
                for(int j=i; j<a[i].length; j++){
                    double s = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = s;
                }
            }
            return a;
        }
        return null ;
    }

    //matrix-vector product
    public static double[] mult(double[][] a, double[] x){
        double[] d = new double[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j]*x[j];
            }
            d[i]=sum;
        }
        return d;
    }

    //vector-matrix product
    public static double[] mult(double[] y, double[][] a){
        double[] d = new double[a.length];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[j][i]*y[j];
            }
            d[i]=sum;
        }
        return d;
    }

    public static void main(String[] args) {
        double[] x = new double[]{1,2,3};
        double[] y = new double[]{3,2,1};
        System.out.println(dot(x,y));

        double[][] a = new double[][]{{1,2,3},{3,2,1}};
        double[][] b = new double[][]{{1,3},{2,2},{3,1}};
        double[][] mul = mult(a,b);
        for(int i=0;i<mul.length;i++){
            for(int j=0;j<mul[i].length;j++){
                System.out.print((int)mul[i][j]+" ");
            }
            System.out.println();
        }

        double[][] c = new double[][]{{1,2,3},{4,5,6},{7,8,9}};
        double[][] t = transpose(c);
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[i].length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }

        double[] mv = mult(c,x);
        for(double m:mv){
            System.out.print((int)m+" ");
        }
        System.out.println();
        double[] vm = mult(x,c);
        for(double m:vm){
            System.out.print((int)m+" ");
        }
    }
}
