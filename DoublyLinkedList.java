package project;
//DoublyLinkedList.java==================
public class DoublyLinkedList {
  //_____node definition_______
  public class listNode{
      private Student data;
      private listNode next;
      private listNode prev;

      public listNode(Student data,listNode prev,listNode next) {
          this.setData(data);
          this.setPrev(prev);
          this.setNext(next);
      }
      public Student getData() {
          return data;
      }
      public void setData(Student data) {
          this.data = data;
      }
      public listNode getNext() {
          return next;
      }
      public void setNext(listNode next) {
          this.next = next;
      }
      public listNode getPrev() {
          return prev;
      }
      public void setPrev(listNode prev) {
          this.prev = prev;
      }
  }
  //_____________________
  private listNode head;
  private int count;
  public DoublyLinkedList() {
      head=null;
      count=0;
  }
  //___________________
  public boolean isEmpty() {
      return head==null;
  }
  //_________________
  public int size() {
      return count;
  }
  //_________________
  public void addFirst(Student stud) {
      listNode node=new listNode(stud,null,null);
      if(isEmpty()) {
          head=node;
          count++;
          return;
      }
      node.setNext(head);
      head.setPrev(node);
      head=node;
      count++;
  }
  //______________________
  public listNode getnode(int i) {
      int x=0;
      listNode tmp=head;
      while(x!=i && tmp!=null)
      {
         tmp=tmp.getNext();
         x++;
      }
      return tmp;
  }
  //______________________
  public void addLast(Student stud) {
      if(isEmpty()) {
          addFirst(stud);
          return;
      }
      listNode tmp=head;
      while(tmp.getNext()!=null)
          tmp=tmp.getNext();
      listNode node=new listNode(stud,tmp,null);
      tmp.setNext(node);
      count++;
  }
  //_____________________
  public void removeFirst() {
      if(isEmpty())
          return;
      if(count==1) {
          head=null;
          count=0;
          return;
      }
      head.getNext().setPrev(null);
      head=head.getNext();
      count--;
  }
  //____________________
  public void removeLast() {
      if(isEmpty())
          return;
      if(count==1) {
          head=null;
          count=0;
          return;
      }
      listNode tmp=head;
      while(tmp.getNext()!=null)
          tmp=tmp.getNext();
      tmp.getPrev().setNext(null);
      count--;
  }
  //_____________________
  public Student first() {
      if(isEmpty())
          return null;
      return head.getData();
  }
  //____________________
  public Student last() {
      if(isEmpty())
          return null;
      listNode tmp=head;
      while(tmp.getNext()!=null)
          tmp=tmp.getNext();
      return tmp.getData();
  }
  //____________________
  Student getStudent(long id) {
      listNode tmp=head;
      while(tmp!=null) {
          if(tmp.getData().getId()==id)
              return tmp.getData();
          tmp=tmp.getNext();
      }
      return null;
  }
  //______________________
  boolean remove(long id) {
      if(isEmpty())
          return false;
      if(count==1 && head.getData().getId()==id) {
          head=null;
          count=0;
          return true;
      }
      listNode tmp=head;
      while(tmp!=null) {
          if(tmp.getData().getId()==id) {
              tmp.getPrev().setNext(tmp.getNext());
              tmp.getNext().setPrev(tmp.getPrev());
              count--;
              return true;
          }
          tmp=tmp.getNext();
      }
      return false;
  }
  //_______________________
  public String toString(){
      listNode tmp=head;
      String S=" ";
      while(tmp!=null) {
          S= S.concat(tmp.getData().toString()+" ");
          tmp=tmp.getNext();
      }
      return S;
  }
  //______________________
}
//=============================