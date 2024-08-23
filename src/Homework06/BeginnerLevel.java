package Homework06;

public class BeginnerLevel {

        public static void main(String[] args) {
//        ReverseString();
//        Palindrom();
//        ConcatenatedString();
//        RemovingVowels();
            WordCapitalizer();
        }


        public static void ReverseString() {
            StringBuilder sb = new StringBuilder("Reverse String");
            System.out.println("Reverse:" + sb.reverse().toString());
        }

        public static void Palindrom() {

            StringBuilder sb = new StringBuilder("madam");
            String original = sb.toString();
            StringBuilder reverse = new StringBuilder(original).reverse();

            if (original.equals(reverse.toString())) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }

        }

        public static void ConcatenatedString() {
            String[] words = {"Tirban", "Renata", "Andrada"};
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : words) {
                stringBuilder.append(word).append(" ");

                System.out.println("Concatenated string: " + stringBuilder.toString());
            }

        }
        public static void RemovingVowels(){
            StringBuilder sb=new StringBuilder("Dezarhiepiscopoconstantinopolizeze");
            String vowels = "aeiouAEIOU";
            for (int i = 0; i < sb.length(); i++) {
                if (vowels.indexOf(sb.charAt(i)) != -1) {
                    sb.deleteCharAt(i);
                    i--; // Ajustează indexul după eliminare pentru a ține cont de caracterele deplasate
                }
            }

            System.out.println("String without vowels: " + sb.toString());
        }
        public static void WordCapitalizer(){
            String str = "Am inceput sa studiez Java.";
            String[] words = str.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                // Adaugă prima literă a fiecărui cuvânt în majusculă
                sb.append(Character.toUpperCase(word.charAt(0)));
            }

            System.out.println("Initials: " + sb.toString());
        }


    }
