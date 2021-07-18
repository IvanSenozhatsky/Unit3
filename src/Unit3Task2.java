public class Unit3Task2 {
    public static void main(String[] args){
        int n=50;
        int x=1;
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=x;
            x+=2;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
