class Node{
    Node left;
    Node right;
    int val;
    Node(int val){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class tree {
    Node root;
    tree(){
        this.root = null;
    }
     void insert(int val){
        callInsert(root,val);
    }
    void callInsert(Node temp,int val){
        if(root == null){
            root = new Node(val);
            return;
        }
        if (val<temp.val){
            if(temp.left != null){
                callInsert(temp.left, val);
            }
            else{
                temp.left = new Node(val);
            }
        }
        if (val>temp.val){
            if(temp.right != null){
                callInsert(temp.right, val);
            }
            else{
                temp.right = new Node(val);
            }
        }
        
    }
    
    void InOrder(){
        callInOrder(root);
    }
    void callInOrder(Node temp){
        if(temp.left != null){
            callInOrder(temp.left);
        }
        System.err.print(temp.val+" ");
        if(temp.right != null){
            callInOrder(temp.right);
        }
    }
    public static void main(String[] args) {
        tree tr = new tree();
        tr.insert(25);
        tr.insert(21);
        tr.insert(52);
        tr.InOrder();
        
    }
}
