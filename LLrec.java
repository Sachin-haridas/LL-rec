public class LL{
    // for printing all tghe elements in ll using reccursion 
    public static void displayr(node head){
        if(head.next==null) return;
        System.out.println(head.data);
        displayr(head.next);
    }

    public static class node{
        int data;
        node next;

        node(int Data){
            this.data = Data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        node a = new node(2);
        node b = new node(3);
        a.next = b;
        // System.out.println(a.next.next);

        // System.out.println(a.data);
        node c= new node(4);
        node d= new node(5);
        node e= new node(6);
        b.next = c;
        c.next = d;
        d.next = e;
        // a.next = b;
        displayr(b);


        // now to print all the elements in the linked list in an order way way we create a new node which is the same as the head node (a) and we traverse through the linkedlist with the help of that node 

        // node temp = a;

        // for(int i=0;i<5;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
            // by doing this we now select the next node 
        // }
        // now if we dont know the no. of elements in the ll 
        // while(temp!=null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        

    }

}