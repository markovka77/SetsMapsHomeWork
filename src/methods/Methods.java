package methods;

import java.util.*;

public interface Methods {
    static void oddNums(List<Integer> nums) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);
    }


    static void evenNums(List<Integer> nums) {
        Set<Integer> oddNumbers = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);
    }

    static void uniqueWords(List<String> strings) {
        Set<String> words = new HashSet<>();
        for (String string : strings) {
            if (strings.contains(string)) {
                words.add(string);
            }
        }
        System.out.println(words);
    }

    static void duplicationWords(List<String> strings) {
        Map<String, String> words = new HashMap<>();
        for (String string : strings) {
            if (strings.contains(string)) {
                words.put(string, String.valueOf(Collections.frequency(strings, string)));
            }
        }
        System.out.println(words);
    }
}






