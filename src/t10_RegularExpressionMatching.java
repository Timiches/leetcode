public class t10_RegularExpressionMatching {

//    public boolean isMatch(String s, String p) {
//        Pattern pattern = Pattern.compile("^" + p + "$");
//        Matcher match = pattern.matcher(s);
//        return match.find();
//    }

    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }
}
