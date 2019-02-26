package Main;

public class SinglyLinkedList {
    private class Node{
        private int data;
        private Node next;
        public int getData(){
            return  data;

        }

        public void setData(int data){
            this.data=data;

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public Node(int data){
            this.data= data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;

        }
    }
    private Node head=null;
    private int size=0;

    public static void main(String[] args){
        SinglyLinkedList linkedList= new SinglyLinkedList();
        System.out.println(linkedList);
        for (int i = 0; i < 5; i++) {
            linkedList.insertHead(i+1);
        }
        linkedList.insertHead(42);
        System.out.println(linkedList);
    }
    @Override
    public String toString(){
        StringBuilder response = new StringBuilder();
        response.append("[");
      Node temp = this.head;
      while (temp!=null){
          response.append(temp.getData());
          if(temp.next!=null){
              response.append(" ==> ");
          }
          temp=temp.next;

      }

        response.append("]");
        return response.toString();
    }
   private void insertHead(int data){
       /* Node newNode = new Node(data,this.head);
        this.head = newNode;*/
       this.head = new Node(data,this.head);
        size++;
    }
    private void insertAfter(int data, Node node){
       /* Node newNode= new Node(data , node.next);
        node.next = newNode;*/
       node.next = new Node(data , node.next);

        size++;

    }

}
