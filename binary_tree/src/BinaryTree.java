class Node{
	int data;
	Node leftChild;
	Node rightChild;
	Node(int value){
		data = value;
		leftChild = null;
		rightChild = null;
	}
	
	public  void display(){
		System.out.print(data + "->");
	}
}

public class BinaryTree{
	Node root = null;
	
	BinaryTree(int data){
		root = new Node(data);
		root.leftChild = null;
		root.rightChild = null;
	}
	
	public void insert(int value){
		Node newNode = new Node(value);
		if(root == null){
			root = newNode;
			root.leftChild = null;
			root.rightChild = null;
		}else{
			Node current = root;
			Node parent = null;
			while(true){
				if(value < current.data){
					parent = current;
					current = current.leftChild;
					if(current == null){
						parent.leftChild = newNode;
						break;
					}
				}else if(value > current.data){
					parent = current;
					current = current.rightChild;
					if(current == null){
						parent.rightChild = newNode;
						break;
					}
				}else{
					System.out.println("having same value in binary tree");
				}
			}	
		}
	}
	
	//后序遍历
	public void postOrderTraverse(){
		System.out.println("后序遍历:");
		postOrderTraverse(root);
		System.out.println();
	}
	public void postOrderTraverse(Node node){
		if(node == null)
			return;
		postOrderTraverse(node.leftChild);
		postOrderTraverse(node.rightChild);
		node.display();
	}
	
	//得到最小值
	public int getMin(){
		Node current = root;
		while(true){
			if(current.leftChild == null)
				return current.data;
			current = current.leftChild;
		}
	}
	public static void main(String[] args){
		BinaryTree bt = new BinaryTree(52);
		bt.insert(580);  
		        bt.insert(12);  
		        bt.insert(50);  
		        bt.insert(58);  
		        bt.insert(9);  
		        bt.insert(888);  
		        bt.insert(248);  
		        bt.insert(32);  
		        bt.insert(666);  
		        bt.insert(455);  
		        bt.insert(777);  
		        bt.insert(999);
		        bt.postOrderTraverse();
		        System.out.println("最小值:" + bt.getMin());
		}
}