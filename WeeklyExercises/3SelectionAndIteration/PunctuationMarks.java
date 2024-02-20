import java.util.HashMap;
public class PunctuationMarks {
    public static void main(String[] args) {
        String text = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        HashMap<Character, Integer> punctuationCount = new HashMap<>();

        text.chars().filter(c -> !Character.isLetterOrDigit(c))
                .forEach(c -> punctuationCount.put((char) c, punctuationCount.getOrDefault((char) c, 0) + 1));

        System.out.println("Punctuation_Mark\tCount");
        System.out.println("---------------\t\t-----");
        punctuationCount.forEach((key, value) -> System.out.println(key + "\t\t\t\t\t" + value));
    }
}