
//Find if the brackets are in order, nested and closed properly
public class BalancedBrackets {
	public static boolean isBalanced(String s) {
		Stack<Character> c = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			switch (ch) {
				case '{' :
				case '[' :
				case '(' :
					c.push(ch);
					break;
				case '}' :
					if (c.isEmpty() || c.pop() != '{')
						return false;
					break;
				case ')' :
					if (c.isEmpty() || c.pop() != '(')
						return false;
					break;

				case ']' :
					if (c.isEmpty() || c.pop() != '[')
						return false;
					break;
				default :
					return false;
			}
		}
		if (c.isEmpty())
			return true;
		else
			return false;
	}
  
    public static void main(String[] args) {

    	System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        System.out.println(isBalanced("{()[][{}]}"));
        System.out.println(isBalanced("()[]"));
        System.out.println(isBalanced("[()][{}]{[({})[]]}"));
    }
}
