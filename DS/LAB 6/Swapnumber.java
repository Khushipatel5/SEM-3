import java.util.Scanner;
public class Swapnumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("After Swapping");
        Swap sp=new Swap();
        sp.Swapum(a,b);
        sc.close();

    }
}
class Swap{
    public void Swapum(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a"+a);
        System.out.println("b"+b);
    }
}
