public class copy {
    public static void main(String[] args) {
        LL l1=new LL();
        LL l2 =new LL();
        l1.insertatfirst(25);
        l1.insertatfirst(12); 
        l1.insertatfirst(20);
        l1.insertatfirst(14); 
        l1.insertatfirst(45);
        l1.insertatfirst(65); 
        // System.out.println("copying");
        l2.copy(l1);
        System.out.println("linked list 1 ");
        l1.display();
        System.out.println("linked list 2 ");
        l2.display();

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
class LL{

    public Node First=null;
    
    public void insertatfirst(int x) {
        Node newNode=new Node(x);
        if(First==null){
            First=newNode;
        }
        else{
        newNode.link = First;
        First = newNode;
        }
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

    public void copy(LL l1){
        Node temp=l1.First;
        while(temp!=null){
            insertatlast(temp.data);
            temp=temp.link;
        }

    }
    public void display(){
        Node save=First;
        while (save!=null){
            System.out.println(save.data);
            save=save.link;
        }
    }
}
