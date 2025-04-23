import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
	}


	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String word = scanner.nextLine();

		System.out.print("Enter a character to find: ");
		char letter = scanner.next().charAt(0);

		int result = lettersToFive(word, letter);
        System.out.println("The position of the 5th occurrence is: " + result);
	}
	public static int lettersToFive(String str, char target) {
		int count = 0;
		int position = 0;

		while (count < 5 && position < str.length()) {
            if (str.charAt(position) == target) {
                count++;
			}
            position++;
			}
 if (count == 5) {
            return position; 
        } else {
            return -1;
		}
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String word = scanner.nextLine();

		System.out.print("Enter a character to count: ");
		char letter = scanner.next().charAt(0);

		int result =  countLetter(word, letter);
        System.out.println("The amount of occurences of " + letter + " is " + result + " times.");
	}
	public static int countLetter(String str, char target) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target){
				count++;
			}
		}

		return count;
	}

	public static void q3() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Insert an integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Insert another integer: ");
		int num2 = scanner.nextInt();

		int result = oddSum(num1, num2);
		System.out.println("The sum of all odd numbers between them is: " + result);
		scanner.close();
	}
		public static int oddSum(int num1, int num2) {
			int start = Math.min(num1, num2);
			int end = Math.max(num1, num2);
			int sum = 0;
	
			for (int i = start; i <= end; i++) {
				if (i % 2 != 0) {
					sum += i;
				}
			}
	
			return sum;
		}

}
