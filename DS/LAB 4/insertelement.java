import java.util.Scanner;
public class insertelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int add[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int b=sc.nextInt();
        System.out.println("Enter the value");
        int a=sc.nextInt();
        for(int i=0;i<b;i++){
            add[i]=arr[i];
        }
        add[b]=a;
        for(int i=b+1;i<n+1;i++){
            add[i]=arr[i-1];
        }
        System.out.println("new array");
        for(int i=0;i<n+1;i++){
            System.out.println(add[i]);
        }
    }
}