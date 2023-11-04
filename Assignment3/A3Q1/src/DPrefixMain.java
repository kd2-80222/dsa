
public class DPrefixMain {
	public static int calculate(int op1, char opr, int op2) {
		switch (opr) {
		case '+':
			return op1 + op2;
		case '-':
			return op1 - op2;
		case '*':
			return op1 * op2;
		case '/':
			return op1 / op2;
		case '%':
			return op1 % op2;
		}
		return 0;
	}

	public static int prefixEvaluate(String prefix) {
		DPrefix pre = new DPrefix(30);
		String[] tokens = prefix.split(" ");
		for (int i = tokens.length - 1; i >= 0; i--) {
			String token = tokens[i];
			if (isNumeric(token)) {
				int number = Integer.parseInt(token);
				pre.push(number);
			} else {
				char operator = token.charAt(0);
				int op1 = pre.pop();
				int op2 = pre.pop();
				int result = calculate(op1, operator, op2);
				pre.push(result);
			}
		}

		if (!pre.isEmpty()) {
			return pre.pop();
		}
		return 0;
	}

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+");
	}

	public static void main(String[] args) {
		String prefix = "+ 23 54 * 64 / 15"; 
		System.out.println("Prefix: " + prefix);
		int result = prefixEvaluate(prefix);
		System.out.println("Result: " + result);
	}
}
