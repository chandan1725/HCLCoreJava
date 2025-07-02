package p1;

public class Demo2 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
