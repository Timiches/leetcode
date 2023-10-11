public class t168_ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            result.append((char)(columnNumber % 26 + 65));
            columnNumber = columnNumber / 26;
        }
        return result.reverse().toString();
    }
}
