public class queuelink {
    public static void main(String[] args) {
        queue q=new queue();
        q.push(12);
        q.push(56);
        q.push(45);
        q.pop();
        q.display();
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
class queue{
    public Node First=null;
    public void push(int data){
        Node newNode=new Node(data);
            newNode.link=First;
            First=newNode;
    }
    public void pop(){
        Node save=First;
        while(save.link.link!=null){
            save=save.link;
        }
        save.link=null;
    }
    public void display(){
        Node save=First;
        while(save!=null){
            System.out.println( "ele"+save.data);
            save=save.link;
        }
    
    }
}
