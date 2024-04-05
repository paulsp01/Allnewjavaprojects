package String1;

public class HighestOccurenceChar {
	public static String highestOccurenceChar(String str) {
		int c=0;
		int arr[]=new int[256];
		for(int i=0;i<arr.length;i++) {
			arr[i]=str.charAt(i);
			c++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
