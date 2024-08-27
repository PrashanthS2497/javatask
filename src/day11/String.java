package day11;

public class String {
	public static void main(String[] args) {
        String str = "Hello";
        try {
            char ch = str.charAt(10); // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: String index is out of bounds.");
        }
    }
}
