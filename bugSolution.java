public class MyClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 10;

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            // Handle the exception appropriately, perhaps by providing a default value or logging the error.
            System.out.println("Using a default value instead.");
        } finally {
            System.out.println("This will always execute.");
        }
    }
}