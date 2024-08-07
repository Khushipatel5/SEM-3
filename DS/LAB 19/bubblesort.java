import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("input elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int exc=0,temp;
        int last=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    exc++;
                }
                
            }
            if(exc==0){
                return;
            }
            else{
                last=last-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
