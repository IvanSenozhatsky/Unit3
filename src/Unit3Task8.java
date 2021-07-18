import java.text.DecimalFormat;
import java.util.Random;

public class Unit3Task8 {
    public static void main(String[] args){
        Random rand = new Random();
        int n=10;
        double[] a= new double[n];
        double[] b= new double[n];
        double[] c= new double[n];
        DecimalFormat dF = new DecimalFormat( "#.##" );
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(10);
            b[i]=rand.nextInt(10);
            if(b[i]!=0){
                c[i]=a[i]/b[i];
            }
            else{
               c[i]=0;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<c.length;i++){
            System.out.print(dF.format(c[i])+" ");
        }
        System.out.println();
    }
}
