public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        selectionSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}
