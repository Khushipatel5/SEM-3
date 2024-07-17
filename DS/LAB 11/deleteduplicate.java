
public class deleteduplicate {
    public static void main(String[] args) {
        Linkedlist s=new Linkedlist();
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(3);
        s.push(1);
        s.push(2);
        s.push(1);
        System.out.println("before");
        s.display();
        s.pop();
        System.out.println("");
        System.out.println("after");
        s.display();
    }
}
class Linkedlist{
    public Node First=null;
    public void push(int data){
        Node newNode=new Node(data);
        if(First==null){
            First=newNode;
            return;
        }
            newNode.link=First;
            First=newNode;
    }
    public void pop(){
        Node save=First;
        
        while(save.link!=null){
            Node pred=save;
            Node check=save.link;
            while(check!=null){
                if(save.data==check.data){
                    pred.link=check.link;
                    }
                else{
                    pred=check;
                }
                check=check.link;
                
            }
            save=save.link;
            
            
        }

    }

    public void display(){
        Node save=First;
        while(save!=null){
            System.out.print( " "+save.data +"   ");
            save=save.link;
        }
    
    }
}
