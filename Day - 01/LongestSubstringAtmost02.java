import java.util.*;
public class LongestSubstringAtmost02 {
    public static void longestSubstring(String str , int k){
        HashMap <Character , Integer> map = new HashMap<>();
        int start = 0 ;
        int maxLen = 0 ;
        int startIndex = 0 ;
        int endIndex = 0 ;
        for (int end = 0 ; end < str.length() ; end++){
            map.put(str.charAt(end) , map.getOrDefault(str.charAt(end), 0)+1);
            while (map.size() > k ){
                map.put(str.charAt(start) , map.get(str.charAt(start)) -1 );
                if (map.get(str.charAt(start)) == 0 ){
                    map.remove(str.charAt(start));
                }
                start++;
            }
            int len = end - start + 1 ;
            if (len > maxLen ){
                maxLen = len;
                startIndex = start;
                endIndex = end+1;
            }
        }
        System.out.print(str.substring(startIndex, endIndex));
    }
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2 ;
        longestSubstring(str, k);
    }
}
