import java.util.Scanner;
public class Factorialrecursion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factorialrecursion f = new Factorialrecursion();
        int ans=f.fact(n);
        System.out.println(ans);
    }

    int fact(int n){
    if(n==0||n==1){
        return 1;
    }
    else{
        return fact((n-1))*n;
    }
    
}
}
