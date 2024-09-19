public class LL {

        public static class node{
                int data;
                node next;
                node(int data){
                    this.data = data;
                }
        }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        System.out.println(a.data);
        // a.next = b;
        b.next = c;
        c.next = d;
        // a.next = b;
        // System.out.println(a.next.data);
        // System.out.println(b.next.data);
        // System.out.println(c.next.data);
        // System.out.println(d.next.data);
        // for insertion 
        node e = new node(8);
            a.next = e;
            e.next = b;
            System.out.println(a.next.data);
            System.out.println(e.next.data);
    }
}