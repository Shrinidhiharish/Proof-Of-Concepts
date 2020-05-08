package basic_Programming_Questions;

public class Palindrome {

	public static void isPalindrome(int num) {
		int reminder = 0;
		int rev = 0;
		int orig;
		orig = num;
		while (num > 0) {
			reminder = num % 10;
			rev = (rev * 10) + reminder;
			num = num / 10;
		}
		if (orig == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		isPalindrome(151);
		isPalindrome(01510);
	}

}
