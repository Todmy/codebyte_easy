package codebyte_easy;

import java.util.*;
import java.io.*;

class TestClass {
	public static void main(String[] args) {

		// keep this function call here
		Scanner s = new Scanner(System.in);
		Function c = new Function();
		// #1
		System.out.println("Enter a phrase for reverse: ");
		String tmpString = s.nextLine();
		System.out.println(c.FirstReverse(tmpString));
//		// #2
		System.out.println("Enter a number for calculation the factorial: ");
		int tmpInt = s.nextInt();
		System.out.println(c.FirstFactorial(tmpInt));
		// #3
		s.nextLine();
		System.out.println("Enter a String line: ");
		String tmpLine = s.nextLine();
		System.out.println(c.LongestWord(tmpLine));

	}
}
