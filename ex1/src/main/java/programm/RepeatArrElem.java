package programm;

public class RepeatArrElem {

    boolean find(int...arr) {
        if (arr.length > 100) {
            return false;
        }
        return findLogic(arr);
    }

    private boolean findLogic(int...arr) {
        int ilength = arr.length - 1;
        int jlenght = arr.length;
        for (int i = 0; i < ilength; i++) {
            for (int j = i + 1; j < jlenght; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
