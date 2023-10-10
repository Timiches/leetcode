public class t6_ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        StringBuilder builder = new StringBuilder();
        char[] word = s.toCharArray();
        for (int i = 0; i < numRows; i++) {
            boolean goingRight = true;
            int j = 0;
            for (char ch : word) {
                if (j == i)
                    builder.append(ch);
                if (j == numRows - 1)
                    goingRight = false;
                else if (j == 0)
                    goingRight = true;
                if (goingRight)
                    j++;
                else j--;
            }
        }
        return builder.toString();
    }
}
