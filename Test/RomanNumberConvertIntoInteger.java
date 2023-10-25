package Test;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConvertIntoInteger {

	public static void main(String[] args) {
		String input = "MDI";

		System.out.print("Integer form of Roman Numeral is " + romanToInt(input));
	}

	private static final Map<Character, Integer> romanArray = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	private static int romanToInt(String s) {
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {

			if (i != s.length() - 1 && romanArray.get(s.charAt(i)) < romanArray.get(s.charAt(i + 1))) {
				sum += romanArray.get(s.charAt(i + 1)) - romanArray.get(s.charAt(i));
				i++;
			} else {
				sum += romanArray.get(s.charAt(i));
			}
		}
		return sum;
	}

}
