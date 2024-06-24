import java.util.Scanner;
public class deleteelement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sizeofarray=sc.nextInt();
        int old_arr[]=new int[sizeofarray];
        int new_arr[]=new int[sizeofarray-1];
        for(int i=0;i<sizeofarray;i++){
            old_arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index");
        int index=sc.nextInt();
        for(int i=0;i<index;i++){
            new_arr[i]=old_arr[i];
        }
        for(int i=index;i<sizeofarray-1;i++){
            new_arr[i]=old_arr[i+1];
        }
        System.out.println("new array");
        for(int i=0;i<sizeofarray-1;i++){
            System.out.println(new_arr[i]);
        }
    }
}