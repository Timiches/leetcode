import java.util.Stack;

public class t151_ReverseWordsInString {
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        boolean flag = true;
        StringBuilder builder = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ' ') {
                flag = true;
                continue;
            }
            else if (flag){
                stack.push(builder.toString());
                builder = new StringBuilder();
                flag = false;
            }
            builder.append(ch);
        }
        stack.push(builder.toString());
        builder = new StringBuilder();
        while(!stack.empty()){
            builder.append(stack.pop()).append(' ');
        }
        return builder.toString().trim();
    }
}
