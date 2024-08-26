package Homework06;
public class Bonus {
    public static void main(String[] args) {
        integerToRoman();
    }
    public static void integerToRoman() {
        // Arrays pentru simboluri romane și valorile lor corespunzătoare
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        int num= 3654;

        if(num>0 && num<3999) {

            for (int i = 0; i < values.length && num > 0; i++) {

                while (num >= values[i]) {
                    sb.append(symbols[i]);
                    num -= values[i];
                }
            }
            System.out.println("Numarul este " + sb);
        }
        else{
            System.out.println("Numar invalid");
        }
    }

}



