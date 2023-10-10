import java.util.LinkedList;
import java.util.List;

public class t17_LetterCombinationsOfAPhoneNumber {
    char[][] set;
    public List<String> letterCombinations(String digits) {
        int sLength = digits.length();
        LinkedList<String> result = new LinkedList<>();
        if (sLength == 0)
            return result;

        char[] word = new char[sLength];
        set = new char[][]{
                {97, 98, 99},
                {100, 101, 102},
                {103, 104, 105},
                {106, 107, 108},
                {109, 110, 111},
                {112, 113, 114, 115},
                {116, 117, 118},
                {119, 120, 121, 122}};

        find3(result, word, digits, sLength, 0);

        return result;
    }

    private void find3(LinkedList<String> result, char[] word, String digits, int length, int from) {
        if (from == length) {
            result.add(new String(word));
            return;
        }
        int digit = digits.charAt(from) - 50;
        for (int j = 0; j < set[digit].length; j++) {
            word[from] = set[digit][j];
            find3(result, word, digits, length, from + 1);
        }
    }
}
