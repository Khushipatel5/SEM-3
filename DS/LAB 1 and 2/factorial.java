import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=1;
        for(int i=5;i>1;i--){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}