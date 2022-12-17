import java.util.*;

public class Parantheses{
	
	public static boolean validParantheses(String s){
		//create a stack
		Stack<Character> paranth = new Stack<>();
		
		//check each character
		for(char c : s.toCharArray()){
			//if it's opening paranthesis push it into stack
			if(c == '(' || c == '[' || c == '{'){
				paranth.push(c);
			}
			
			//match the paranthesis
			else if (c == ')' && !paranth.isEmpty() && paranth.peek() == '(') {
                paranth.pop();
            } else if (c == ']' && !paranth.isEmpty() && paranth.peek() == '[') {
                paranth.pop();
            } else if (c == '}' && !paranth.isEmpty() && paranth.peek() == '{') {
                paranth.pop();
            }
            
            else {
                return false;
            }
        }
        return paranth.isEmpty();
		}
		
	public static void main(String args[]){
		//call the validParantheses() method & get output
		System.out.println(validParantheses("()")); //true
		System.out.println(validParantheses("()[]{}")); //true
		System.out.println(validParantheses("(]")); //false
	}
}
