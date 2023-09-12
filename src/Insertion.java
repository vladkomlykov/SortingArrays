public class Insertion {

    int[] arr = {6,34,56,87,2,5};

    public void insertingSorting() {
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
