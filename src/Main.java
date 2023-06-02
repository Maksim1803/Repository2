// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//еще одна ветка для образца
    public static void main(String[] args) {
            String text = "aba aba a!a abba adca abea";
            Pattern pattern = Pattern.compile("a..a");

            Matcher matcher = pattern.matcher(text);
            while (matcher.find());
                    {
            System.out.println(matcher.replaceAll(""));
                                           }
        }
    }

