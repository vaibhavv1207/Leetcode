import java.util.*;
public class LongestUnqiueSum01 {
    public static int UniqueSum(int arr[]){
        int sum = 0 ;
        int maxSum = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        int start = 0 ;
        for (int end = 0 ; end < arr.length ; end++){
            map.put(arr[end] , map.getOrDefault(arr[end], 0)+1);
            while (map.get(arr[end]) > 1 ){
                map.put(arr[start] , map.get(arr[start])-1);
                sum -= arr[start];
                if (map.get(arr[start]) == 0 ){
                    map.remove(arr[start]);
                }
                start++;
            }

            sum += arr[end];
            maxSum = Math.max(maxSum , sum );
        }
        return maxSum;
    }    
    public static void main(String[] args) {
        int arr[] = {4,2,4,4,5,6};
        int result = UniqueSum(arr);
        System.out.println("The Unique Sum is: "+result);
    }
}
