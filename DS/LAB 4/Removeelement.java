import java.util.Scanner;

public class Removeelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        System.out.println("Enter the size of array:");
        int sizeofarray = sc.nextInt();
        
        // Create the old array
        int[] old_arr = new int[sizeofarray];
        
        // Input elements into the old array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < sizeofarray; i++) {
            old_arr[i] = sc.nextInt();
        }
        
        // Input the value to delete
        System.out.println("Enter the value to delete:");
        int old_value = sc.nextInt();
        
        // Find index of old_value in old_arr
        int index = -1;
        for (int i = 0; i < sizeofarray; i++) {
            if (old_arr[i] == old_value) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            System.out.println("Value not found in the array.");
        } else {
            // Create the new array with size reduced by 1
            int[] new_arr = new int[sizeofarray - 1];
            
            // Copy elements from old_arr to new_arr, skipping old_value
            int newIndex = 0;
            for (int i = 0; i < sizeofarray; i++) {
                if (i != index) {
                    new_arr[newIndex] = old_arr[i];
                    newIndex++;
                }
            }
            
            // Print the new array
            System.out.println("New array:");
            for (int i = 0; i < sizeofarray - 1; i++) {
                System.out.println(new_arr[i]);
            }
        }
        
        sc.close();
    }
}

