public class count {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertatfirst(12);
        l.insertatfirst(16);
        l.insertatfirst(1);
        l.insertatfirst(56);
        l.insertatfirst(24);
        l.printlist();
        l.count();
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
    public void printlist() {
        Node node = First;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.link;
        }
        System.out.println(); 
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
