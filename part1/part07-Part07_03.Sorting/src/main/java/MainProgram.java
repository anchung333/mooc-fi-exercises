
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIdx = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[smallestIdx]) {
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int toSwap = indexOfSmallestFrom(array, i);
            swap(array, i, toSwap);
        }
    }

}
