import java.util.Map;
import java.util.HashMap;

public class Duplicates {

    static int[] nums = {3,4,3, 5, 8, 8, 9 , 7, 5,3,6,7,2,1};
    static Map<Integer, Integer> map;

    public static void main(String[] args) {
        map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }    
        
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                System.out.println(i + ": " + map.get(i));
            }
        }


    }
    

}
