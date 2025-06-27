import java.util.*;
public class CharTransformer {
	 public static void main(String[] ar) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String:");
	        String s = sc.nextLine();
	        char[] arr = s.toCharArray();

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 'A') {
	                arr[i] = 'B';
	            } else if (arr[i] == 'a') {
	                arr[i] = '@';
	            } else if (arr[i] == '1') {
	                arr[i] = '2';
	            }
	        }
            String res = new String(arr);
	        System.out.println("Modified String: " + res);
			sc.close();
	    }
}
