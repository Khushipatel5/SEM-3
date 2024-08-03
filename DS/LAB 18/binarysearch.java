import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("input sorted array only");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int left=0;
        int right=5-1;
        System.out.println("enter the element u want to search");
        int a=sc.nextInt();
        // int middle=(right+left)/2;
        // System.out.println(middle);

        while(left<=right){
            int middle=(right+left)/2;
            if(arr[middle]==a){
                System.out.println("element at "+middle+"index");
                return ;
            }
            else{
                if(arr[middle]<a){
                    left=middle+1;
                }
                else {
                    right=middle-1;

                }
            }
            
        }
        System.out.println("element not found");

    }
}
