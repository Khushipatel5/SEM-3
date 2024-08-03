public class doubly {
    public static void main(String[] args) {
        DLL dl=new DLL();
        dl.dll_ins_fir(21);
        dl.dll_ins_fir(11);
        dl.dll_ins_fir(10);
        dl.dll_ins_last(45);
        dl.dll_ins_given(14, 2);
        dl.display();
        dl.dll_del(21);
        System.out.println();
        dl.display();
    }
}
class Node{
    int data;
    Node RPTR;
    Node LPTR;
    Node(int data){
        this.data=data;
        this.LPTR=null;
        this.RPTR=null;
    }
}
class DLL{
    public Node L=null;
    public Node R=null;
    public void dll_ins_fir(int data){
        Node newNode=new Node(data);
        if(L==null){
            L=newNode;
            R=newNode;
        }
        else{
            newNode.RPTR=L;
            L.LPTR=newNode;
            L=newNode;
        }
    }
     public void dll_ins_last(int data){
        Node newNode=new Node(data);
        if(L==null){
            L=newNode;
            R=newNode;
        }
        else{
            newNode.LPTR=R;
            R.RPTR=newNode;
            R=newNode;
        }
     }

     public void dll_ins_given(int data,int position){
        Node newNode=new Node(data);
        
        if(L==null){
            dll_ins_last(data);
        }
        else{
            int curr=0;
            Node save=L;
            while(save!=null&& curr!=position){
                save=save.RPTR;
                curr++;
            }
            newNode.RPTR=save;
            newNode.LPTR=save.LPTR;
            save.LPTR.RPTR=newNode;
            save.LPTR=newNode;           
        }

    }
    public void dll_del(int x){
       if(L.data==x){
            if(L==R){
                L=null;
                R=null;
            }
            L.RPTR.LPTR=null;
            L=L.RPTR;
            return;
       }
            Node save=L;
            Node pred=null;
            while(save.data != x && save != null){
            
                pred=save;
                save=save.RPTR;
                if(save.data==x ){
                if(save==R){
                    pred.RPTR=null;
                    R=pred;
                    return;
                }
                save.RPTR.LPTR=pred;
                pred.RPTR=save.RPTR;
                return;
            }
        }
    }
    
    public void display(){
        Node save=L;
        do{
            System.out.print(save.data+"->");
            save=save.RPTR;
        }while(save!=null);
    }

}
