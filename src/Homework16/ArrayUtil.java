package Homework16;

public class ArrayUtil {
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        swap(arr, 0, 1);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
