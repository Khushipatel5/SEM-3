import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        System.out.println("Enter the"+ i +"element");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter 1st element");
    int firstno=sc.nextInt();
    System.out.println("Enter 2nd element");
    int secondno=sc.nextInt();
    int index1=0,index2=0;
    for(int i=0;i<size;i++){
        if(firstno==arr[i]){
            index1=i;
        }
        else if( secondno==arr[i]){
            index2=i;
        }
    }
    
    System.out.println("index1= "+index1);
    System.out.println("index2= "+index2);
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
    System.out.println("Updated array");
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    
    }
}
