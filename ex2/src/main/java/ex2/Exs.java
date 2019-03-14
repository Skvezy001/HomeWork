package ex2;


class Exs {


    public int[][] permutation(int[] arr) {
        int elementsLength = factorial(arr.length);
        int elementLength = arr.length;
        int[][] result = new int[elementsLength][elementLength];
        int[] element = new int[arr.length];
        rePastl(element, arr);
        int position = 0;
        int controller = 1;

        for (int i = 0; i < elementLength; i++) {

            int j = 0;

            while (j != -1){
                rePastl(result[position++], element);
                if ( j == elementLength - 2 ) {
                    j = 0;
                }

                change(element, j, j + 1);

                ++j;

                if ( controller == factorial(elementLength - 1)){
                    j = -1;
                }
                ++controller;

            }
            change(arr, i, elementLength - 1);
            rePastl(element, arr);
            controller = 1;

        }
        return result;
    }

    private int factorial(int n) {
        int result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    private void rePastl(int[] element, int[] arr){
        for(int i = 0; i < arr.length; i++){
            element[i] = arr[i];
        }
    }

    private void change(int arr[], int i, int j){
        int num;
        num = arr[i];
        arr[i] = arr[j];
        arr[j] = num;

    }

}
