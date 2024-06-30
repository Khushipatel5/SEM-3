import java.util.Scanner;;
public class stack_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lengthof array");
            int length=sc.nextInt();
            Stack s=new Stack(length);
            int k=0;
        int c=0;
        while(k!=5){
            System.out.println("Enter 1 for push 2 for pop 3 for peep 4 for change 5 for display");
            int k1=sc.nextInt();
            c=c+1;
            switch (k1) {
                case 1:
                int p=sc.nextInt();
                    s.push(p);
                    break;
            
                case 2:
                s.pop();
                    break;
            
                case 3:
                System.out.println("Enter the index of element u want");
                int j=sc.nextInt();
                    s.peep(j);
                    break;
        
                case 4:
                System.out.println("Enter the element u want to put ");
                int nu=sc.nextInt();
                System.out.println("Enter the index of element u want");
                int i=sc.nextInt();
                s.change(nu,i);
                break;
        
                case 5:
                s.diplay(c);
                continue;
    
                default:
                    break;
            }
            
        }
        sc.close();
    }
}
class Stack{
    Scanner sc=new Scanner(System.in);
    int top;
    int []arr;
    int length;
    Stack(int length){
        this.length=length;
        this.top=-1;
        arr=new int[length];

    }
    public void push( int p){
        if(top>=length-1){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            arr[top]=p;
            System.out.println("element is inserted");
        }
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        else{
            top--;
            ;
            System.out.println(arr[top+1]);


        }
    }
    public void peep(int j){
        if((top-j+1)<=0){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(arr[top-j+1]);
        }
    }
    public void change(int nu,int i){
        if((top-i+1)<=0){
            System.out.println("Stack underflow");
        }
        else{
            arr[top-i+1]=nu;
            System.out.println("Element has been changed");
            System.out.println(arr[top-i+1]);
        }
    }
    public void diplay(int c){
        for(int i=0;i<=c;i++){
            System.out.println("arr["+i+"]"+arr[i]);
        }
    }
}
