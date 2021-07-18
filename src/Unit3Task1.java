public class Unit3Task1 {
    public static void main(String[] args){
        int n=10;
        int x=2;
        int[] a = new int[n];
        for (int i=0 ;i<a.length;i++){
            a[i]=x;
            x+=2;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
