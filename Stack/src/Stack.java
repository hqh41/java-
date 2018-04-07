public class Stack{
	private int top = -1;
	private Object[] objs;
	
	public Stack(int capacity) throws Exception{
		if(capacity < 0)
			throw new Exception("Illegal capacity:" + capacity);
		objs = new Object[capacity];
	}
	
	public void push(Object obj) throws Exception{
		if(top == objs.length - 1)
			throw new Exception("Stack id full");
		objs[++top] = obj;
	}
	
	public Object pop() throws Exception{
		if(top == -1)
			throw new Exception("Stack is empty");
		return objs[top--];
	}
	
	public void display(){
		System.out.println("bottom->top");
		for(int i = top; i >= 0; i--){
			System.out.print(objs[i] + "->");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) throws Exception{
		Stack s = new Stack(3);
		s.push(1);
		s.push(2); 
		s.display(); 
        System.out.println(s.pop());  
        s.display();  
        s.push(99);    
        s.push(100);
        s.display();
	}
}