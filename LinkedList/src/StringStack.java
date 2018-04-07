import java.util.*;

public class StringStack{
	private LinkedList<String> linkedList = new LinkedList<String>();
	public void push(String name){
		linkedList.addFirst(name);
	}
	
	public String getTop(){
		return linkedList.getFirst();
	}
	
	public String pop(){
		return linkedList.removeFirst();
	}
	
	public int size(){
		return linkedList.size();
	}
	
	public boolean isEmpty(){
		return linkedList.isEmpty();
	}
	
	public static void main(String[] args){
		StringStack s = new StringStack();
		s.push("yulong");
		s.push("xiaoyun");
		s.push("羽龙共舞");
		System.out.println("第一个元素是:\t");
		System.out.println(s.getTop());
		System.out.println();
		System.out.println("全部元素:");
		while(!s.isEmpty()){
			System.out.println("\t" + s.pop());
		}
	}
}