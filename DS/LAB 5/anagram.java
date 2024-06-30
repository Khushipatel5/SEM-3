import java.util.*;
import java.util.Arrays;

public class AnagramGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }

        int m =(int) (Math.random()*n);
        // System.out.println(m);

        System.out.println(arr[m]);

        System.out.println("enter anagram: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] c=arr[m].toCharArray();

        Arrays.sort(ch);
        Arrays.sort(c);
        int flag = 0;
        for(int i=0; i<c.length; i++){
            if(c[i]==ch[i]){
                flag++;
                continue;
            }
            else{
                System.out.println("not anagram");
                break;
            }
        }
        if(flag==c.length){
            System.out.println("Anagram");
        }
        sc.close();
        
    }
}
