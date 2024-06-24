import java.util.Scanner;
public class average{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,n=0;
        double avg;
        for(int i=1;i<=a;i++){
            sum=sum+i;
            n++;
        }
        avg=sum/n;
        System.out.println(avg);
    }
}