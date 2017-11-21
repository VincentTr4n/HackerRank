package Documents;

import java.util.*;

public class Next_lexicographical_permutation_algorithm {

	public static boolean nextPermutation(char[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		// Now i is the head index of the suffix

		// Are we at the last permutation already?
		if (i <= 0)
			return false;

		// Let array[i - 1] be the pivot
		// Find rightmost element that exceeds the pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;
		// Now the value array[j] will become the new pivot
		// Assertion: j >= i

		// Swap the pivot with j
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		// Reverse the suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		// Successfully computed the next permutation
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			String s = in.next();
			char[]c = s.toCharArray();
			if (nextPermutation(c))
				System.out.println(c);
			else
				System.out.println("no answer");
		}

		in.close();
	}

}
