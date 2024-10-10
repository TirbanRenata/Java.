package Homework17;

interface StringTrimmer{
    String trim(String str, int n);
}
public class StringTrimming {
    public static void main(String... args) {

        StringTrimmer stringTrimmer = (str, n) -> {
            if (str == null) {
                return null;
            }
            return n > str.length() ? str : str.substring(0, n);
        };

        System.out.println("Trimmed string: " + stringTrimmer.trim("Hello",3));
        System.out.println("Trimmed string: " + stringTrimmer.trim("Hello",5));
        System.out.println("Trimmed string: " + stringTrimmer.trim("Hello",7));
    }
}
