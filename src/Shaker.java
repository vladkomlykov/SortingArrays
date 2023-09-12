public class Shaker {

    int[] arr = {32,465,87,2,7,67,1};

    public void shakerSorting() {
        int arrLeft = 0;
        int arrRight = arr.length - 1;
        int num;

        do {
            for (int i = arrLeft; i < arrRight; i++) {
                if (arr[i] > arr[i+1]) {
                    num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
            }
            arrRight--;
            for (int i = arrRight; i > arrLeft; i-- ) {
                if (arr[i] < arr[i - 1]) {
                    num = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = num;
                }
            }
            arrLeft++;
        } while (arrLeft < arrRight);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
