public class ArrayGeneric<T> {
    private T[] array;

    ArrayGeneric(T[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.print("Array elements: ");
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        ArrayGeneric<Integer> arr1 = new ArrayGeneric<>(intArray);
        arr1.printArray();
    }
}
