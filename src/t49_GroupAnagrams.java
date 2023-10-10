import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class t49_GroupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//        if (strs == null || strs.length==0) {
//            result.add(List.of(""));
//            return result;
//        }
//        List<String> groups = new ArrayList();
//        for (int i=0;i<strs.length;i++) {
//            char[] x = strs[i].toCharArray();
//            Arrays.sort(x);
//            String key = new String(x);
//            // System.out.println(key);
//            int index = groups.indexOf(key);
//            if (index!=-1) {
//                result.get(index).add(strs[i]);
//            } else {
//                groups.add(key);
//                List<String> v = new ArrayList();
//                v.add(strs[i]);
//                result.add(v);
//            }
//        }
//
//        return result;
//    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
