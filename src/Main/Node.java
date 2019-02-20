package Main;

public class Node {
    //commit- ctrl+K
    // push ctrl+shift+k

private int data ;
private Node next;
public int getData(){
    return data ;
}
public void getData(int data){
    this.data = data;

}
public Node(){
    this.data =0 ;
this.next = null;
}
public Node(int data){
this.data = data;
this.next = null;
}
public Node( int data,Node next){
    this.data = data;
    this.next = next;
}
}
