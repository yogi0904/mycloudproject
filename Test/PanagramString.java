package Test;

public class PanagramString {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		boolean[] listOfAlphabet = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			listOfAlphabet[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (listOfAlphabet[i] == false)
				flag = 0;
		}
		if (flag == 1)
			System.out.print(" string is a pangram.");
		else
			System.out.print(" string is not a pangram.");
	}

}
