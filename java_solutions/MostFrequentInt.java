import java.util.Map;
import java.util.HashMap;

public class MostFrequentInt {
    static int[] arr = {1, 3, 3, 5, 6, -2, -3, 4, 7, 7};

    public static void main(String args[]) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Integer maxKey = 0;
        boolean keyTouched = false;
        for (Integer key : map.keySet()) {
            if (keyTouched) {
                if (map.get(key) > map.get(maxKey)) {
                    maxKey = key;
                }
            } else {
                maxKey = key;        
                keyTouched = true;
            }
        }
        System.out.println("max key '" + maxKey + "' with " + map.get(maxKey) + " occurances"); 
    }
}
