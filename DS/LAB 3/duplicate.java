import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter"+i+"elemnet");
            a[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j = i + 1; j < n; j++) {    
            if(a[i] == a[j])    
                flag=true;
        }
    }
    if(flag==true){
        System.out.println("Duplicate");
    }
    else{
        System.out.println(" not Duplicate");
    }
}}