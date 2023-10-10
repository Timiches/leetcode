public class t13_RomanToInteger {

/*
    static Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int romanToInt(String s) { // slower
        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (i + 1 < length && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;
            }
            else
                sum += map.get(s.charAt(i));
        }

        return sum;
    }
*/

    static char[] charSet;
    static int charSetLength = 0;
    static int i;

    int romanToInt(String s) {
        int sum = 0;
        charSet = s.toCharArray();
        charSetLength = charSet.length;

        for (i = 0; i < charSetLength; i++) {
            sum += defineChar(charSet[i]);
        }

        return sum;
    }

    private static int defineChar(char ch) { // faster
        switch (ch) {
            case 'I': //I can be placed before V (5) and X (10) to make 4 and 9.
                if (i + 1 < charSetLength && charSet[i + 1] == 'V') {
                    i++;
                    return 4;
                } else if (i + 1 < charSetLength && charSet[i + 1] == 'X') {
                    i++;
                    return 9;
                } else
                    return 1;
            case 'V':
                return 5;
            case 'X': //X can be placed before L (50) and C (100) to make 40 and 90.
                if (i + 1 < charSetLength && charSet[i + 1] == 'L') {
                    i++;
                    return 40;
                } else if (i + 1 < charSetLength && charSet[i + 1] == 'C') {
                    i++;
                    return 90;
                } else
                    return 10;
            case 'L':
                return 50;
            case 'C': //C can be placed before D (500) and M (1000) to make 400 and 900.
                if (i + 1 < charSetLength && charSet[i + 1] == 'D') {
                    i++;
                    return 400;
                } else if (i + 1 < charSetLength && charSet[i + 1] == 'M') {
                    i++;
                    return 900;
                } else
                    return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;

        }
        return 0;
    }
}
