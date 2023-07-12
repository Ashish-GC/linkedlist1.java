
class Node{
    int val;
    Node next;  
    Node(int val){
        this.val=val;
        this.next=null;
    }
}


class MyLinkedList {
      Node head;
      Node tail;
      int size=0;
    public MyLinkedList() {
      head=null;
      tail=null;
    }
    
         
    public int get(int index) {

       Node temp=head;
          for(int i=0;i<index;i++){
            temp=temp.next;
          }
        if(temp==null){return -1;}
          return temp.val;
    }
    
    public void addAtHead(int val) {
         Node temp=new Node(val);
        if(head==null){
            head=temp;
            return;
        }
        else{
               temp.next=head;
                head=temp;
        }
              
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(head==null){
            tail=temp;
            head=temp;
            return;
        }
          Node temp1=head;
       while(temp1.next !=null){
             temp1=temp1.next;
       }
            temp1.next=temp;
    }
    
    public void addAtIndex(int index, int val) {
        Node temp=new Node(val);
        if(index==0){
            head=temp;
            return;
        }
          Node temp1=head;
          Node temp2=temp1;
        for(int i=0;i<index;i++){
            temp2=temp1;
            temp1=temp1.next;
        }
        temp2.next=temp;
        temp.next=temp1;
            
    }
    
    public void deleteAtIndex(int index) {
           Node temp=head;
             if(index==0){
                 temp=head.next;
                 head=temp;
                 return;
             }
             Node temp1=temp;
             for(int i=0;i<index;i++){
                 temp1=temp;
                 temp=temp.next;
             }
             if(temp==null){return;}
             else if(temp.next==null){
                 temp1.next=null;
                 temp=null;
             }
             else{
               temp1.next=temp.next;
               temp=null;
             }
             
    }
    public static void main(String[] args) {
        
  MyLinkedList obj = new MyLinkedList();

  obj.addAtHead(2);
//   obj.addAtTail(2);
  obj.addAtIndex(0,1);
//   obj.deleteAtIndex(1);
int param_1 = obj.get(1);
         
System.out.println(param_1);
    }
}


 