public class lab_10_1 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        
        Linkedlist list=new Linkedlist();

        list.insertatfirst(251);
        list.insertatfirst(252);
        list.insertatfirst(253);
        list.insertatfirst(254);
        list.printlist();

    }
}

class Node{
    int data;
    Node link;
    public Node(int data){
        this.data=data;
        this.link=null;

    }

}
class Linkedlist{ 
    public Node First=null; 
    public void insertatfirst(int x){
        Node new_Node=new Node(x);
        new_Node.link=First;
        First=new_Node;
        System.out.println("list inderted");
    }
    public void printlist(){
        Node node=First;
        while(node != null){
            System.out.println(node.data);
            node=node.link;
        }
        System.out.println("\n");
    }
}

