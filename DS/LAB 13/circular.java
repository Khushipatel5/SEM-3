public class circular {
  public static void main(String[] args) {
    LL cl=new LL();
    cl.cir_ins_fir(41);
    cl.cir_ins_fir(21);
    cl.cir_ins_last(60);
    cl.cir_ins_last(62);
    cl.cir_ins_ord(26);
    cl.display();
    cl.delete_pos(2);
    cl.del(60);
    System.out.println();
    cl.display();
  }  

}
class LL{
    public Node First=null;
    public Node Last=null;
    public void cir_ins_fir(int data){
        Node newNode=new Node(data);
        if(First == null) {  
            newNode.link = newNode; 
            First = newNode;  
            Last = newNode;
        }  
        else {  
            newNode.link=First; 
            Last.link = newNode;  
            First=newNode;
        }
    }
    
    public void cir_ins_ord(int data){
        Node newNode=new Node(data);
        if(First==null){
            newNode.link=newNode;
            Last=newNode;
            First=newNode;
        }
        else{
            if(newNode.data<=First.data){
                newNode.link=First;
                Last.link=newNode;
                First=newNode;
            }
            else{
                Node save=First;
                while(save!=Last && newNode.data>=save.link.data){
                   save=save.link;
                }
                newNode.link=save.link;
                save.link=newNode;
                if(save==Last){
                    Last=newNode;
                }
            }
        }
    }

    public void cir_ins_last(int data){
        Node newNode=new Node(data);
        if(First==null){
            newNode.link=newNode;
            First=newNode;
            Last=newNode;
        }
        else{
            newNode.link=First;
            Last.link=newNode;
            Last=newNode;
        }
    }
    
    public void delete_pos(int x){
        int curr=1;
        Node save=First;
        Node pred=null;
        if(x==0){
            return;
        }
        else if(x==1){
            save=save.link;
            Last.link=save;
        }
        else{
            while(curr<x){
                pred=save;
                save=save.link;
                curr++;
            }
            pred.link=save.link;
            if(save==Last){
                Last=pred;
                Last.link=First;
            }
        }
    }
    public void del(int x){
        if(First==null){
            System.out.println("LL is empty");
            return;
        }
        Node save=First.link;
        Node pred=First;
        if(pred.data==x){
            First=First.link;
            Last.link=First;
        }
        while(save.data!=x&& save.link!=First){
            save=save.link;
            pred=pred.link;
        }
        pred.link=save.link;
        if(save.data!=x&& save.link==First){
            System.out.println("NODE NOT FOUND");
        }

    }
    public void display(){
        Node save=First;
        do{
            System.out.print(save.data+"->");
            save=save.link;
        }while(save!=First);
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