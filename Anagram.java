package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Declare or initialize 2 strings
		String text1 = "stops";
		String text2 = "potss";
		String same="";
		int len1 = text1.length();
		int len2 = text2.length();
		//Compare length of 2 strings
		if (len1 == len2) {
			//Convert strings to char array
			char[] arr1 = text1.toCharArray();
			char[] arr2 = text2.toCharArray();
			//Sorting the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//Compare both the arrays
				for (int i = 0; i < arr1.length; i++) {
					for (int k = 0; k < arr2.length; k++) {
						if (arr1[i]==arr2[k]) {
							same +=arr2[k];
							break;
				}
			}
		}
					System.out.println("Anagram:" +same);
		}
	}
			
}