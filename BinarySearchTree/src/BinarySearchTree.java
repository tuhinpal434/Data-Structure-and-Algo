
public class BinarySearchTree {
    class Node{
        int key;
        Node left,right;

        public Node(int key) {
            this.key = key;
            left=right=null;
        }
    }

    Node root;
    public BinarySearchTree() {
        root=null;

    }
// Insert Method
    void insert(int key){
        root = insertRec(root,key);
    }
    Node insertRec(Node root,int key){
        if(root==null) return new Node(key);
        if(key<root.key) {
            root.left = insertRec(root.left, key);
        }
        else if(key>root.key){
                root.right=insertRec(root.right,key);
        }
        return root;
    }

    //InOrder Traversal Method

    void inOrder(){
        inOrderRec(root);
    }
    void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }
//Delete
    void deletenode(int key){
        root=deleteRec(root,key);

    }
    Node deleteRec(Node root,int key){
        if(root==null) return null;

        else if(key>root.key) {
            root.right=deleteRec(root.right,key);
        }
        else if (key<root.key){
            root.left=deleteRec(root.left,key);
        }
        else{
            if(root.left==null && root.right==null){
                root=null;
            }
            else if(root.left==null && root.right!=null){
                Node temp=root;
                temp=null;
                root=root.right;

            }
            else if(root.left!=null && root.right==null){
                Node temp=root;
                temp=null;
                root=root.left;
            }
            else{
                Node temp=FindminRec(root.right);
                root.key=temp.key;
                root.right=deleteRec(root.right,temp.key);
            }
        }
        return root;
    }
	Node FindminRec(Node root) {
		// TODO Auto-generated method stub
		while(root.left!=null){
            root=root.left;
        }
		return root;
	}
}




