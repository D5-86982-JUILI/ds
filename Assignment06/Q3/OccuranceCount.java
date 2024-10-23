package Q3;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCount {
public static void main(String[] args) {

String line = "Hello Hello, my name is Juili.";

Map<String, Integer> wordCount = new HashMap<>();

String[] words = line.split(" ");

for (String word : words) {
           word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
           if (!word.isEmpty()) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
               
           }
       }

       for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
   }
}