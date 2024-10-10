package Homework17;

interface StringJoin{
    String string(String str1, String str2);
}
public class StringJoiner {
    public static void main(String[] args) {


        StringJoin join = (str1, str2) -> str1 + " " + str2;

        String result = join.string("Ana","Maria");
        System.out.println(result);
    }
}
