public class ExcelSheetColumnNumber {
    /*
    https://leetcode.com/problems/excel-sheet-column-number/
     */
    public int titleToNumber(String columnTitle) {
        int sum=0;
        for(char i:columnTitle.toCharArray()){
            sum*=26;
            sum+=i-'A'+1;
        }
        return sum;
    }
}
