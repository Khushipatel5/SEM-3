import java.util.Scanner;
public class ascinsert{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeofarray=sc.nextInt();
        int old_arr[]=new int[sizeofarray];
        int new_arr[]=new int[sizeofarray+1];
        for(int i=0;i<sizeofarray;i++){
            old_arr[i]=sc.nextInt();
        }
        int index=0;
        System.out.println("enter the new value");
        int new_value=sc.nextInt();
        for(int i=0;i<sizeofarray;i++){
            if(old_arr[i]>new_value){
                index=i-1;

            }
        }
        for(int i=0;i<index;i++){
            new_arr[i]=old_arr[i];
        }
        new_arr[index]=new_value;
        for(int i=index+1;i<sizeofarray+1;i++){
            new_arr[i]=old_arr[i-1];
        }
        System.out.println("new array");
        for(int i=0;i<sizeofarray+1;i++){
            System.out.println(new_arr[i]);
        }

    }
}