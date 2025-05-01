package arrayandstring;

public class arrayTraversing {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("array elements (another approach): ");
        for (int j : array) {
            System.out.println(j + " ");
        }
    }
}
