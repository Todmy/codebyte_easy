package codebyte_easy;

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
			num = (FirstFactorial(num-1)*num);
		} else {
			return num;
		}

		return num;

	}
}