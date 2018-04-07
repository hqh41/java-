import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args){
		List<String> userlist = new ArrayList<String>();
		userlist.add("yulon");
		userlist.add("xiaoyun");
		userlist.add("羽龙共舞");
		System.out.println("使用普通for循环");
		for(int i = 0; i < userlist.size(); i++){
			System.out.println(userlist.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("使用Iterator迭代器");
		Iterator it = userlist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println();
		System.out.println("使用增强for循环");
		
		for(String s : userlist){
			System.out.println(s);
		}
	}
}