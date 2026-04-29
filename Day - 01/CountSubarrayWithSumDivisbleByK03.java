
import java.util.*;

public class CountSubarrayWithSumDivisbleByK03 {
    public static int countSubarrays(int arr[] , int k ){
        int count = 0 ;
        int sum = 0 ;
        HashMap<Integer , Integer > map = new HashMap<>();
        map.put(0,1);
        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            int value = ((sum % k)+k)%k;
            count += map.getOrDefault(value, 0);
            map.put(value , map.getOrDefault(value, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println("Total Subarray are: "+countSubarrays(arr, k));
    }
}
