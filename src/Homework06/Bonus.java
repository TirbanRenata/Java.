package Homework06;
public class Bonus {
    public static void main(String[] args) {
        IntegerToRoman();
    }
    public static void IntegerToRoman() {
        // Arrays pentru simboluri romane și valorile lor corespunzătoare
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        int num= 3749;

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                sb.append(symbols[i]);
                num -= values[i];
            }
        }


        System.out.println("Numarul este " + sb);
    }

}



