import java.util.*;
import java.util.Map.Entry;

public class MapTest5{
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a", "zhangsan");
		map.put("b", "lisi");
		map.put("c", "wangwu");
		
		Set<String> keySet = map.keySet();
		
		for(Iterator<String> iterator = keySet.iterator(); iterator.hasNext();){
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("***************");
		
		for(String key : map.keySet()){
			System.out.println(key + "=" + map.get(key));
		}
		System.out.println("***************");
		
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("***************");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for(Iterator<Map.Entry<String, String>> iterator = entrySet.iterator(); iterator.hasNext();){
			Map.Entry<String, String> entry = iterator.next();
			System.out.println(entry.getKey()+"="+entry.getValue()); 
		}
		System.out.println("***************");
		
		for(String value : map.values()){
			System.out.println(value);
		}		
	}
}