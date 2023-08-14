import java.util.regex.*;  

class Solution {
    public String validIPAddress(String queryIP) {
        Pattern ipv4 = Pattern.compile("(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
        Matcher m4 = ipv4.matcher(queryIP);
        if(m4.matches()) {
            return "IPv4";
        }
        
        Pattern ipv6 = Pattern.compile("(([0-9 a-f A-F]{1,4})\\:){7}[0-9 a-f A-F]{1,4}");
        Matcher m6 = ipv6.matcher(queryIP);
        if(m6.matches()) {
            return "IPv6";
        }
        return "Neither";
    }
}