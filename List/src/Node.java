class Node{
	int data;
	Node next;
	
	Node(int value){
		data = value;
		next = null;
	}
	
	public void display(){
		System.out.print(data + "->");
	}
	
	public static Node recursionReverse(Node n){
		if(n == null || n.next == null){
			return n;
		}
		Node recursionReverse = recursionReverse(n.next);
		n.next.next = n;
		n.next = null;
		return recursionReverse;
	}
	
	public static void main(String[] args){
		Node[] nodes = new Node[10];
		for(int i = 0; i < 10; i++){
			nodes[i] = new Node(i);
		}
		for(int i = 0; i < 10-1; i++){
			nodes[i].next = nodes[i+1];
			nodes[i].display();
		}
		System.out.println();
		System.out.println("逆序:");
		Node a = Node.recursionReverse(nodes[0]);
		Node current = a;
		for(int i = 0; i < 10; i++){
			current.display();
			current = current.next;
		}
	}
}

