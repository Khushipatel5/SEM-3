import java.util.Scanner;
public class duplicatedelete {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int index=sc.nextInt();
    int arr[]= new int[index];

    for(int i=0;i<index;i++){
    arr[i]=sc.nextInt();
    }
    int value=0;

    for(int i=0;i<index;i++){
        for(int j=i+1;j<index;j++){
            if(arr[i]==arr[j]){
                value++;
            }
        }

    }
    System.out.println("newindex"+value);
    int new_arr[]=new int[index-value];
    for(int i=0;i<index-value;i++){
        for(int j=i+1;j<index;j++){
            if(arr[i]!=arr[j]){
                new_arr[i]=arr[j];
            }
            }
        }
    }
    for(int i=0;i<index-value;i++){
        System.out.println(new_arr[i]);
    }

}
