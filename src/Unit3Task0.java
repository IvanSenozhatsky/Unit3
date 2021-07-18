import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n= scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(11);
            System.out.print(a[i]+" ");
        }
    }
}
