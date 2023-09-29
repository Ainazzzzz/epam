import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 4, 5, 7);
        List<Integer> aa = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(aa);

        List<String> words = Arrays.asList("mama", "papa", "daddy");
        List<Integer> length = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length);
        List<String> wordsUnique=Arrays.asList("apple","banana","cherry");
        List<Character> dist = wordsUnique.stream().flatMap(c-> c.chars().mapToObj(d->(char)d)).distinct().collect(Collectors.toList());

    }
}