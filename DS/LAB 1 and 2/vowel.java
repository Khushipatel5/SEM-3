import java.util.Scanner;
public class vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char str=sc.next().CharAt();
        if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u'||  str=='A'||str=='E'||str=='I'||str=='O'||str=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println(" not a Vowel");
        }
    }
}