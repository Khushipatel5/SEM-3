import java.util.Scanner;
public class minmax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter"+i+"elemnet");
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int max=a[0];
        for(int i=0;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("min="+min);
        System.out.println("max="+max);

    }
}