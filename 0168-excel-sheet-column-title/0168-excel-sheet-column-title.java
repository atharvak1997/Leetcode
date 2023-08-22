class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber != 0) {
            int n = (columnNumber - 1) % 26;
            res = (char)(n + 'A') + res;
            columnNumber = (columnNumber - 1) / 26;
        }
        return res;
    }
}