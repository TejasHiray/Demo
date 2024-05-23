public class StackClass{
    static class node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head = newNode;
                return;

            }
            newNode.next=head;
            head=newNode;
        }
        public class int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
    }
    public static void main(String args[]){

    }
}