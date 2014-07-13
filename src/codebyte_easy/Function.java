package codebyte_easy;

import java.util.regex.*;

class Function {
	String FirstReverse(String str) {

		if (str.length() > 0) {
			String tmp = str.substring(0, 1);
			str = FirstReverse(str.substring(1)) + tmp;
		} else {
			return str;
		}

		return str;

	}

	int FirstFactorial(int num) {

		if (num > 1) {
			num = (FirstFactorial(num - 1) * num);
		} else {
			return num;
		}

		return num;

	}

	String LongestWord(String line) {
		Pattern pat = Pattern.compile("[a-zA-Z]");// a-z
		int num = 0;
		int numtmp = 0;
		line += " ";
		String word = "";
		for (int i = 0; i < line.length(); i++) {
			String sign = line.substring(i, i + 1);
			Matcher mat = pat.matcher(sign);
			boolean tmp = mat.matches();
			if (sign.equals(" ") || !tmp) {
				if (num < numtmp) {
					word = line.substring(i - numtmp, i);
					num = numtmp;
				}
				numtmp = 0;
			} else if (tmp) {
				numtmp++;
			}
		}
		return word;
	}
}