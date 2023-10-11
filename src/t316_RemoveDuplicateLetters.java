import java.util.Stack;

public class t316_RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int lastIndex[] = new int[26];

        for(int i = 0;i<s.length();i++){
            lastIndex[s.charAt(i)-'a'] = i;
        }

        boolean visited[] = new boolean[26];

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            while(!st.isEmpty()&& ch<=st.peek() && lastIndex[st.peek()-'a']>=i && !visited[ch-'a']){
                char top = st.pop();
                visited[top-'a'] = false;
            }
            if(!visited[ch-'a']){
                st.add(ch);
                visited[ch-'a'] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
