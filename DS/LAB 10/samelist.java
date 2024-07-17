public class samelist {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        l1.insertatfirst(12);
        l1.insertatfirst(16);
        l1.insertatfirst(1);
        l1.insertatfirst(56);
        l1.insertatfirst(24);
        l2.insertatfirst(12);
        l2.insertatfirst(17);
        l2.insertatfirst(1);
        l2.insertatfirst(56);
        l2.insertatfirst(24);
        l1.display();
        l2.display();
        // l1.compare(l2);
        if(l1.compare(l2)){
            System.out.println("same");
        }
        else{
            System.out.println("Not same");
        }
        
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
class LinkedList{
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
    public boolean compare(LinkedList l2){
        Node save1=this.First;
        Node save2=l2.First;
        while(save1.link!=null && save2.link!=null){
            if(save1.data!=save2.data){
                return false;
            }
            else{
                save1=save1.link;
                save2=save2.link;
            }
        }
            return true;        
        }
    
    


    public void display() {
        Node node = First;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.link;
        }
        System.out.println(); 
    }
    
}
