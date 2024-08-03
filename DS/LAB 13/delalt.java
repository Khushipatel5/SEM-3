public class delalt {
    public static void main(String[] args) {
        DLL d=new DLL();
        // d.dll_ins_fir(10);
        d.dll_ins_fir(9);
        d.dll_ins_fir(8);
        d.dll_ins_fir(7);
        d.dll_ins_fir(6);
        d.dll_ins_fir(5);
        d.dll_ins_fir(4);
        d.dll_ins_fir(3);
        d.dll_ins_fir(2);
        d.dll_ins_fir(1);
        d.display();
        d.del_alt();
        System.out.println();
        d.display();
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
    public void del_alt() {
        if (L == null || R == null) {
            return;
        } else {
            Node save = L.RPTR;  
            Node prev = L; 
            
            while (save != R) {  
                prev.RPTR = save.RPTR; 

                prev = save; 
                save = save.RPTR;
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