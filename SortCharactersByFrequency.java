import java.util.*;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        if(s.length() == 0) {
            return "";
        }
        else {
            // long loadStart = System.nanoTime();
            int counter = 0;
            StringBuilder ans = new StringBuilder("");

            //add character occurrences to map
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            //stream map and sort
            Map<Character, Integer> sorted = map
                .entrySet()
                .stream()
                .sorted(
                    Collections.reverseOrder(
                        Map.Entry.comparingByValue()
                    )
                )
                .collect(
                    toMap(
                        e -> e.getKey(),
                        e -> e.getValue(),
                        (e1, e2) -> e2,
                        LinkedHashMap::new
                    )
                );

            for(Map.Entry<Character, Integer> e: sorted.entrySet()) {
                counter = e.getValue();
                Character c = e.getKey();
                while(counter > 0) {
                    ans.append(c);
                    counter--;
                }
            }

            // long loadFinish = System.nanoTime();
            // System.out.println("TOTAL TIME: " + (loadFinish - loadStart));
            return ans.toString();
        }
    }

    public static void main(String[] args) {
        SortCharactersByFrequency scbf = new SortCharactersByFrequency();
        String a = "his s he a ha he  ha ae";
        System.out.println(scbf.frequencySort(a));
        // System.out.println("caasssseee -> " + scbf.condense("caasssseee"));
    }
}
