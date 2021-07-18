import java.util.Random;

public class Unit3Task5 {
    public static void main(String[] args){
        Random random = new Random();
        int n = 5;
        int[] a= new int[n];
        int[] b= new int[n];
        int sum1=0,sum2=0;
        int av1=0,av2=0;
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(16);
            sum1+=a[i];
            System.out.print(a[i]+" ");
        }
        av1=sum1/n;
        System.out.println();
        for(int i=0;i<b.length;i++){
            b[i]= random.nextInt(16);
            System.out.print(b[i]+" ");
            sum2+=b[i];
        }
        av2=sum2/n;
        System.out.println();
        if(av1>av2){
            System.out.println("Среднее значение больше у массива А");
        }
        else if(av2>av1){
            System.out.println("Среднее значение больше у массива B");
        }
        else{
            System.out.println("Средние значения массивов равны");
        }

    }
}
