import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=0;
        if(m<n){
            for(int i=m;i<=n;i++){
                sum=sum+i;
            }
            System.out.println("sum="+sum);
        }
        else{
            System.out.println("invalid range");
        }
    }
}