import java.util.Random;

public class Unit3Task6 {
    public static void main(String[] args){
        Random random = new Random();
        int n = 4;
        int k=0 ;

        int[] a= new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=random.nextInt(11);
            System.out.print(a[i]+" ");
        }
        for (int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                k=1;
                System.out.println("Не является строго возрастающей последовательностью");
                break;
            }
        }

        if(k==0){
            System.out.println("Является строго возрастающей последовательностью");
        }
    }
}

