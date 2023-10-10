public class t67_AddBinary {
    public String addBinary(String a, String b) {
        String result = "";
        char[] bigger;
        char[] smaller;
        if (a.length() > b.length()) {
            bigger = a.toCharArray();
            smaller = b.toCharArray();
        } else {
            bigger = b.toCharArray();
            smaller = a.toCharArray();
        }
        int biggerSize = bigger.length - 1;
        int smallerSize = smaller.length - 1;
        int add = 0;
        while (smallerSize >= 0) {
            bigger[biggerSize] += smaller[smallerSize] + add;
            switch (bigger[biggerSize]) {
                case 96 -> {
                    bigger[biggerSize] = 48;
                    add = 0;
                }
                case 97 -> {
                    bigger[biggerSize] = 49;
                    add = 0;
                }
                case 98 -> {
                    bigger[biggerSize] = 48;
                    add = 1;
                }
                case 99 -> {
                    bigger[biggerSize] = 49;
                    add = 1;
                }
                default -> {
                }
            }
            biggerSize--;
            smallerSize--;
        }
        while (biggerSize >= 0) {
            bigger[biggerSize] += 48 + add;
            switch (bigger[biggerSize]) {
                case 96 -> {
                    bigger[biggerSize] = 48;
                    add = 0;
                }
                case 97 -> {
                    bigger[biggerSize] = 49;
                    add = 0;
                }
                case 98 -> {
                    bigger[biggerSize] = 48;
                    add = 1;
                }
                case 99 -> {
                    bigger[biggerSize] = 49;
                    add = 1;
                }
                default -> {
                }
            }
            biggerSize--;
            smallerSize--;
        }
        if (add == 1) {
            result = "1";
        }
        return result + new String(bigger);
    }
}
