public class Bubble {

    int[] arr = {5, 23, 653, 81, 76, 43, 12, 9};

    public void bubbleSorting() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {

                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
