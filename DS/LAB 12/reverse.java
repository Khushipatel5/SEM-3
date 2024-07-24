public class reverse {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.insertatfirst(25);
        l1.insertatfirst(12); 
        l1.insertatfirst(20);
        l1.insertatfirst(14); 
        l1.insertatfirst(45);
        l1.insertatfirst(65);
        l1.display();
        l1.reverse();
        System.out.println("reversed");
        l1.display();
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
    public void display(){
        Node save=First;
        while (save!=null){
            System.out.println(save.data);
            save=save.link;
        }
    }
    public void reverse(){
        Node prevNode=First;
        Node current=First.link;
        if(First==null|| current==null){
            return;
        }
        
        while(current!=null){
            Node nextNode=current.link;
            current.link=prevNode;

            prevNode=current;
            current=nextNode;
        }
        First.link=null;
        First=prevNode;
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
