class Node{
	int val;
	Node left;
	Node right;
	Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class tree {
	Node root;
	tree(){
		this.root = null;
	}
	
	void insert(int val){
		callInsert(root, val);
	}
	public Node callInsert(Node refroot,int val) {
		if(refroot == null){
            return new Node(val);
        }
        if(val < refroot.val){
            refroot.left = callInsert(refroot.left, val);
        }
        if(val > refroot.val){
            refroot.right = callInsert(refroot.right, val);
        }
        return refroot;
	}

	void inOrder(){
		callinorder(root);
	}
	void callinorder(Node refroot){
		if (refroot != null){
			callinorder(refroot.left);
			System.out.println(refroot.val+" ");
			callinorder(refroot.right);
		}
	}
	public static void main(String[] args) {

			tree tr = new tree();
			tr.insert(14);
			tr.insert(45);
			tr.insert(77);
			tr.insert(23);
			tr.insert(45);
			tr.inOrder();
	}

}
