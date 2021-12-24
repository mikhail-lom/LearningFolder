public class SimpleBubbleSort {




    public static void main(String[] args) {
        int[] dataArray = {0, 5, 98, -7, 2, 4, 63};
        // outer loop with iteration counter
        for (int i = 0; i < dataArray.length - 1; i++) {
        // inner loop for comparison of two nearby elements
            for (int j = dataArray.length - 1; j > i; j--) {
                if (dataArray[j] < dataArray[j-1]) {
                    int tmp = dataArray[j];
                    dataArray[j] = dataArray[j-1];
                    dataArray[j-1] = tmp;
                }
            }
        }

        for (int x =0; x < dataArray.length; x++) {
            System.out.print(dataArray[x] + " ");
        }
    }

}
