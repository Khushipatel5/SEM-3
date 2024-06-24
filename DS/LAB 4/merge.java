import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1");
        int index1=sc.nextInt();
        System.out.println("Enter the size of array 2");
        int index2=sc.nextInt();
        int arr3[]=new int[index1+index2];
        int arr1[]= new int[index1];
        int arr2[]= new int[index2];
        System.out.println("For array 1");
        for(int i=0;i<index1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("For array 2");
        for(int i=0;i<index2;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=0;i<index1;i++){
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < index2; i++) {
            arr3[index1 + i] = arr2[i];
        }
        System.out.println("new array");
        for(int i=0;i<(index1+index2);i++){
            System.out.println(arr3[i]);
        }
    }
}
