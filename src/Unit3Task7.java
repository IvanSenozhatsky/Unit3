import java.util.Random;

public class Unit3Task7 {
    public static void main(String[] args){
        Random rand = new Random();
        int n=12;
        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(16);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int max=a[0];
        int maxi=0;
        for (int i=1;i<a.length;i++){
            if(a[i]>=max){
                max=a[i];
                maxi=i;
            }
        }
        System.out.println("Максимальный элемент массива и его последняя позиция = "+max+" a["+maxi+"]");
    }
}
