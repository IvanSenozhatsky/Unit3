import java.util.Random;

public class Unit3Task3 {
    public static void main(String[] args){
        Random random = new Random();
        int n=15;
        int counter=0;
        int[] a = new int[n];
        for (int i=0;i<a.length;i++){
            a[i]= random.nextInt(100);
            System.out.print(a[i]+" ");
            if(a[i]%2==0){
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
