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
}