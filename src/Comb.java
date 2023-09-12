public class Comb {
    int[] arr = {43, 65, 23, 46, 87, 23, 1};

    public void combSorting() {
        int gap = arr.length;
        boolean flag = false;

        while (!flag || gap != 1) {

            if (gap < 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            flag = true;

            for (int i = gap; i < arr.length; i++) {

                if (arr[i - gap] > arr[i]) {
                    int num = arr[i];
                    arr[i] = arr[i - gap];
                    arr[i - gap] = num;
                    flag = false;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
