import java.util.Random;

public class Unit3Task4 {
    public static void main(String[] args){
        Random random = new Random();
        int n = 20;
        int[] a= new int[n];
        for (int i=0;i<a.length;i++){
            a[i]= random.nextInt(21);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            if(i%2>0){
                a[i]=0;

            }
            System.out.print(a[i]+" ");
        }
    }
}
