
/*Write a program to implement stack using singly linked list */

import java.util.Scanner;

public class stacklink {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        while(true ){
            int a=sc.nextInt();
            switch (a) {
                case 1:
                    int data=sc.nextInt();
                    s.push(data);
                    break;
        
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    
                default:
                    break;
            }
        }
        // s.push(12);
        // s.push(15);
        // s.pop();
        // s.push(21);
        // s.display();
    }
}
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        this.link=null;
    }
}
class Stack{
    public Node First=null;
    public void push(int data){
        Node newNode=new Node(data);
            newNode.link=First;
            First=newNode;
    }
    public void pop(){
        First=First.link;
    }
    public void display(){
        Node save=First;
        while(save!=null){
            System.out.println( "ele"+save.data);
            save=save.link;
        }
    
    }

}
