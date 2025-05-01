package arrayandstring;

public class arrayInserting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int insertValue = 10;
        int insertIndex = 2;

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < insertIndex; i++) {
            newArray[i] = array[i];
        }

        newArray[insertIndex] = insertValue;

        for (int i = insertIndex; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("array elements: ");
            for (int num : newArray){
                System.out.println(num + " ");
            }
        }
}

