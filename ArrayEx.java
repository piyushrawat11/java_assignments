package array;

public class arrayex {

	public static void main(String[] args) {
		int[] arr;
		arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int v:arr) {
			System.out.println(v);
		}
		String[] arr1 =new String[3];
	}
	

}
