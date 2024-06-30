import java.util.Scanner;
public class multiply {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][2];
        int arr2[][]=new int[2][3];
        int arr3[][]=new int[3][3];
        System.out.println("1st array");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("2nd array");
        for(int m=0;m<2;m++){
            for(int n=0;n<3;n++){
                arr2[m][n]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
               for (int k = 0; k < 2; ++k) {
                  arr3[i][j] += arr1[i][k] * arr2[k][j];
               }
            }
         }
         System.out.println("Multiplied array");
         for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
               System.out.print(arr3[i][j]+" ");
            }
            System.out.print("\n");
         }

    }
}
