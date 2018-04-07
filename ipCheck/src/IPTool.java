public class IPTool{
	public static boolean ipCheck(String str){
		if(str != null && !(str.isEmpty())){
			String regex = "^([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])$";
			if(str.matches(regex))
				return true;
			else
				return false;
		}
		return false;
	}
	public static void main(String[] args){
		String b1 = "192.168.1.1";
		String b2 = "10.0.0.1";
		String b3 = "127.256.0.1";
		String b4 = "iugerjiogjioe";
		String b5 = "172.16,0.1";
		System.out.println(IPTool.ipCheck(b1));
		System.out.println(IPTool.ipCheck(b2));
		System.out.println(IPTool.ipCheck(b3));
		System.out.println(IPTool.ipCheck(b4));
		System.out.println(IPTool.ipCheck(b5));
		}
	
}