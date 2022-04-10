
public class BinaryTree {

	  Node root;
	
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int d){
			data=d;
			right=null;
			left=null;
		}
	}
	
	public void insert(int a) {
		 root=insertNode(root,a);
	}
	
	public Node insertNode(Node node,int a) {
		if(node==null) {
			return new Node(a);
		}
		else {
			if(node.data>a) {
				node.left=insertNode(node.left,a);
			}
			else {
				node.right=insertNode(node.right,a);
			}
		}
		return node;
	}
	
	public void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
			
		}
	}
	
	public void postorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			inorder(node.right);
			System.out.println(node.data);
			
			
		}
	}
	public void preorder(Node node) {
		if(node!=null) {
			System.out.println(node.data);
			inorder(node.left);
			inorder(node.right);
			
			
		}
	}
	
	public static void main(String[] args) {
		BinaryTree obj=new BinaryTree();
		obj.insert(10);
		obj.insert(5);
		obj.insert(30);
		obj.insert(40);
		obj.inorder(obj.root);
		System.out.println("===================");
		obj.postorder(obj.root);
		System.out.println("===================");
		obj.preorder(obj.root);

	}

}
