import java.util.Scanner;

public class mergesortdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Merge m = new Merge();
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); // Close the scanner
        m.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

class Merge {
    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int[] b = new int[high - low + 1];
        int h = low;
        int j = mid + 1;
        int x = 0;

        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                b[x++] = arr[h++];
            } else {
                b[x++] = arr[j++];
            }
        }

        while (h <= mid) {
            b[x++] = arr[h++];
        }

        while (j <= high) {
            b[x++] = arr[j++];
        }

        for (int i = 0; i < b.length; i++) {
            arr[low + i] = b[i];
        }
    }
}
