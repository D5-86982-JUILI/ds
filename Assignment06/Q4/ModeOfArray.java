package Q4;
import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2,2,2,2,2,2, 3, 3, 3, 4, 4, 4, 4, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = array[0];
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        System.out.println("Mode: " + maxCount);
        System.out.println(mode+" Have the highest occurance with "+maxCount+" in the Array" );
    }
}