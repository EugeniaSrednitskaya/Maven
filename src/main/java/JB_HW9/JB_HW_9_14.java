package JB_HW9;

import java.util.ArrayList;

public class JB_HW_9_14 {
//    Написать алгоритм NegativeOnTheRight, который принимает на
//    вход массив целых чисел, и возвращает массив, в котором
//    все негативные числа находятся во второй половине массива
//    Test Data: {4, -3, 7, -12, 5, -2, 9, 4, 12}
//    → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    public int[] NegativeOnTheRight(int[] array) {
        int[] arrayResult = new int[array.length];
        ArrayList<Integer> arrayPositive = new ArrayList<>();
        ArrayList<Integer> arrayNegative = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                arrayPositive.add(array[i]);
            }
            else if (array[i] < 0) {
                arrayNegative.add(array[i]);
            }
        }

        int i = 0;
        for (int x: arrayPositive) {
            arrayResult[i] = x;
            i++;
        }


        for (int x: arrayNegative) {
            arrayResult[i] = x;
            i++;
        }

        return arrayResult;

    }
}
