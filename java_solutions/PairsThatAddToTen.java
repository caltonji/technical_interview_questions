import java.util.Map;
import java.util.HashMap;

public class PairsThatAddToTen {
    static int addTo = 10;
    static Map<Integer, Integer> numMap;
    static int[] nums = {1, 5, 4, 3, 7, 6, 5, 2, 1};

    public static void main(String[] args) {
        numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer pairIndex = numMap.get(addTo - nums[i]);
            if (pairIndex != null && (int)  pairIndex != i) {
                System.out.println("pair: " + nums[i] + " + " + nums[pairIndex] + " = " + addTo);
                numMap.put(nums[pairIndex], null);
                numMap.put(nums[i], null);
            }  
        }
    }

}
