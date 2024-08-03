import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Enter the element u want to search");
        int a=sc.nextInt();
        for(int i=0;i<10;i++){
            if(arr[i]==a){
                System.out.println("element at "+i+"index");
                return;
            }
        }
        System.out.println("element not found");
        
    }
}
