package Homework06;

public class MediumLevel {
    public static void main(String[] args) {
//    StringReplacement();

//        DuplicateCharacterRemover();

//        InsertingAtIndex();
//        FrequencyCounter();
        MorseCodeConverter();
    }
    public static void StringReplacement(){
        StringBuilder str = new StringBuilder("Imi place sa studiez Java");
        String target = "studiez";
        String replacement = "invat";

        int index = str.indexOf(target);
        System.out.println(str.replace(index,index+target.length(),replacement));

    }
    public static void DuplicateCharacterRemover(){
        StringBuilder str = new StringBuilder("Andreea");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean isDuplicate = false;

            for(int j =0;j<result.length();j++){
                if(ch == result.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result.append(ch);
            }
            System.out.println(result.toString());
        }
    }
    public static void InsertingAtIndex(){
        StringBuilder str = new StringBuilder("Hello my friend");
        String toInsert = "Beautiful";
        int index = 8;
        str.insert(index, toInsert);
        System.out.println(str.toString());
    }

    public static void FrequencyCounter() {
        StringBuilder str = new StringBuilder("Hello");
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }


    public static void MorseCodeConverter() {
        StringBuilder sb = new StringBuilder("Ajutor123");
        String upperStr = sb.toString().toUpperCase(); // Convertim șirul la majuscule
        StringBuilder morseCode = new StringBuilder(); // Construim noul șir Morse

        for (int i = 0; i < upperStr.length(); i++) {
            char c = upperStr.charAt(i);

            switch (c) {
                case 'A':
                    morseCode.append("..");
                    break;
                case 'B':
                    morseCode.append("-..");
                    break;
                case 'C':
                    morseCode.append("-.-.");
                    break;
                case 'D':
                    morseCode.append("--..");
                    break;
                case 'E':
                    morseCode.append(".,");
                    break;
                case 'F':
                    morseCode.append(".,-.");
                    break;
                case 'G':
                    morseCode.append("--.");
                    break;
                case 'H':
                    morseCode.append("..,..");
                    break;
                case 'I':
                    morseCode.append(".-");
                    break;
                case 'J':
                    morseCode.append(".---");
                    break;
                case 'K':
                    morseCode.append("-.-");
                    break;
                case 'L':
                    morseCode.append(".-..");
                    break;
                case 'M':
                    morseCode.append("--");
                    break;
                case 'N':
                    morseCode.append("-.*");
                    break;
                case 'O':
                    morseCode.append("---");
                    break;
                case 'P':
                    morseCode.append(".-*-.");
                    break;
                case 'Q':
                    morseCode.append("-+-.-");
                    break;
                case 'R':
                    morseCode.append(".-*");
                    break;
                case 'S':
                    morseCode.append(".*.");
                    break;
                case 'T':
                    morseCode.append("-");
                    break;
                case 'U':
                    morseCode.append("*.-");
                    break;
                case 'V':
                    morseCode.append("...-");
                    break;
                case 'W':
                    morseCode.append(".--");
                    break;
                case 'X':
                    morseCode.append("-..-");
                    break;
                case 'Y':
                    morseCode.append("-.*-");
                    break;
                case 'Z':
                    morseCode.append("-,-..");
                    break;
                case '1':
                    morseCode.append(".-+--");
                    break;
                case '2':
                    morseCode.append("..-+-");
                    break;
                case '3':
                    morseCode.append(".*.--");
                    break;
                case '4':
                    morseCode.append(".,..-");
                    break;
                case '5':
                    morseCode.append("..--..");
                    break;
                case '6':
                    morseCode.append("-.*..");
                    break;
                case '7':
                    morseCode.append("--.-.");
                    break;
                case '8':
                    morseCode.append("-*-..");
                    break;
                case '9':
                    morseCode.append("-+--.");
                    break;
                case '0':
                    morseCode.append("--*,-");
                    break;
                case ' ':
                    morseCode.append(" ");
                    break;
                default:
                    morseCode.append("");
                    break;
            }
            morseCode.append(" ");
        }

        System.out.println(morseCode);
    }



}


