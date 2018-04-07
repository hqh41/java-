import java.util.*;
public class MapTest3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一句英语，单词用空格隔开");
		
		String sentence = sc.nextLine();
		
		String[] arr = sentence.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < arr.length; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				int num = map.get(arr[i]);
				map.put(arr[i], ++num);
			}
		}
		System.out.println("统计单词出现的个数，结果如下："); 
		
		Set<String> set = map.keySet();
		for(String a : set){
			System.out.println(a + "=" + map.get(a));
		}
		
		System.out.println("删除元素:");
		map.remove("love");
		Set<String> s = map.keySet();
		for(String a : s){
			System.out.println(a + "=" + map.get(a));
		}
	}
}