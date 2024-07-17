import java.util.Scanner;

public class lab10_2 {
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        // Linkedlist list1=new Linkedlist();
        // list.insertatfirst(40);
        // list.insertatfirst(30);
        
        // list.insertatfirst(20);
        // list.insertatlast(50);
        // list.insertatfirst(10);
        // list.insord(25);
        // list.insord(21);
        // list.printlist();
        // list.deletelast();
        // list.delete(40);
        // list.delete(20);
        // list.count();
        // list1.copy(list);
        // list.printlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        System.out.println("1 for insert at first");
        System.out.println("2 for insert at last");
        System.out.println("insord");
        System.out.println("4 for delete at first");
        System.out.println("5 for delete at last");
        System.out.println("6 for count");
        System.out.println("7 for print and exit");
        
        while(true){
        int a=sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter the element u want to insert at first");
                    int x=sc.nextInt();
                    list.insertatfirst(x);
                    break;
            
                case 2:
                    System.out.println("Enter the element u want to insert at last");
                    int y=sc.nextInt();
                    list.insertatlast(y);
                break;
                
                case 3:
                System.out.println("Enter the element u want to insert in order");
                    int z=sc.nextInt();
                    list.insord(z);
                break;
                case 4:
                list.deletefirst();
                break;

                case 5:
                list.deletelast();
                break;
                case 6:
                list.count();
                break;
                
                case 7:
                list.printlist();
                break;
                default:
                    break;
            }
        

       
}
}}
class Node{
    int data;
    Node link;
    Node(int data){
        this.data=data;
        this.link=null;
    }
}
class Linkedlist {
    public Node First = null;

    public void insertatfirst(int x) {
        Node new_Node = new Node(x);
        new_Node.link = First;
        First = new_Node;
        return;
    }
    
    public void insertatlast(int x){
        Node new_Node=new Node(x);
        
        if(First==null){
            new_Node.link = First;
            First = new_Node;
        }
        else{
        Node save=First;
        while(save.link!=null){
            save=save.link;
        }
        save.link=new_Node;
    }
    return;
    }

    public void insord(int x) {
        Node new_Node = new Node(x);
        
        if (First == null && x <= First.data) { 
            new_Node.link = First;
            First = new_Node;
        } 
        else{
            Node save = First;
            while (save.link != null && x > save.link.data) {
                save = save.link;
            }
            new_Node.link = save.link;
            save.link = new_Node;
        }
        return;
    }

    public void printlist() {
        Node node = First;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.link;
        }
        System.out.println(); 
}

    public void deletefirst(){
        if(First==null){
            System.out.println("underflow");
        }

        First=First.link;
return;
    }

    public void deletelast(){
        if(First==null){
            System.out.println("underflow");
        }
        Node save=First;
        while(save.link.link!=null){
            save=save.link;
        }
        save.link=null;
        return;
    }

   
    public void delete(int x){
        if(First==null){
            System.out.println("empty");
        }
        else{
            if(First.data==x){
                First=First.link;
            }
            Node pred=First;
            Node save=First.link;
            while(save.data!=x){
                save=save.link;
                pred=pred.link;
            }
            pred.link=save.link;
            
        }
        return;
     }

    public void count(){
        int count=0;
        if(First==null){
            count=0;
            return;
        }
       
        else{
            count=1;
            Node save=First;
            do{
                count++;
                save=save.link;
            }while(save.link!=null);
        }
        System.out.println("count"+count);
        return;
    }
    
    }