public class QuickSort{
	public static int QS(int[] a, int start, int end){
		int base = a[end];
		while(start < end){
			while(start < end && a[start] <= base)
				start++;
			if(start < end){
				int tmp = a[start];
				a[start] = a[end];
				a[end] = tmp;
				end--;
			}
			while(start < end && a[end] > base)
				end--;
			if(start < end){
				int tmp = a[start];
				a[start] = a[end];
				a[end] = tmp;
				start++;
			}
		}
		return end;
	}
	
	public static void sort(int[] a, int start, int end){
		if(start > end)
			return;
		int b = QS(a, start, end);
		sort(a, start, b-1);
		sort(a, b+1, end);
	}
	
	public static void main(String[] args){
		int[] a = {2,7,4,5,10,1,9,3,8,6};
		sort(a, 0, a.length-1);
		System.out.println("排序的结果");
		for(int x : a){
			System.out.println(x + " ");
		}
	}
}