class node{
    node next;
    int val;
    node(int val){
        this.next = null;
        this.val = val;
    }
}

public class circularLL {
    node last;
    
    circularLL() {
        this.last = null;
    }
    
    boolean isEmpty(){
        boolean b = false;
        if(last == null) {
            b = true;
        }
        return b;
    }
    void insert_at_first(int val) {
        node newnode = new node(val);

        if(isEmpty()) {
            last = newnode;
            last.next = last;
        }
        else {
            newnode.next = last.next;
            last.next = newnode;
        }
    }
    void printLL() {
        if(isEmpty()) {
            return;
        }
        node temp = last.next;
        while(temp != last) {
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.print(temp.val+"-->");
    }
    void printFor(){
        node temp = last.next;
        for(int i=0;i<8;i++){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
    }

public static void main(String[] args) {
        circularLL cll= new circularLL();
        cll.insert_at_first(20);
        cll.insert_at_first(21);
        cll.insert_at_first(58);
        cll.insert_at_first(23);
        cll.insert_at_first(45);
        cll.printLL();
        System.out.println();

        cll.printFor();
    }

}
