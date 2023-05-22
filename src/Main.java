import methods.Methods;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 8, 5, 5, 6, 7));
        Methods.oddNums(nums);
        Methods.evenNums(nums);

        List<String> strings = new ArrayList<>(List.of("песики", "песики", "тебе", "нравятся", "песики"));
        Methods.uniqueWords(strings);
        Methods.duplicationWords(strings);


    }
}