package day11;

public class ArrayIndex {

    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            int value = array[10]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
