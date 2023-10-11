public class t171_ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int j = 0;
        char[] title = columnTitle.toCharArray();
        for(int i = title.length - 1; i >= 0; i--){
            result = result + (title[i] - 64) * (int)Math.pow(26, j++);
        }
        return result;
    }
}
