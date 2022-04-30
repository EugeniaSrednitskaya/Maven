package JB_HW9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class JB_HW_9_10 {
    //    Написать алгоритм PeakElement, который принимает
//    на вход массив целых чисел и возвращает значения пиковых
//    элементов (элементы, которые больше своих соседей).
//    Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    public int[] PeakElement(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> arraySet = new HashSet<>();

        for (int x: array) {
            arraySet.add(x);
        }

        if (arraySet.size() > 1) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0 && array[i] > array[i + 1]) {
                    arrayList.add(array[i]);
                }
//            else if (i == 0 && array[i] < array[i+1]) {
//                arrayList.add(array[i+1]);
//            }

                if (i > 0 && i < array.length
                        && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    arrayList.add(array[i]);
                }
                if (i == array.length - 1 && array[i] > array[i - 1]) {
                    arrayList.add(array[i]);
                }
//            else if (i == array.length - 1 && array[i] < array[i - 1]) {
//                arrayList.add(array[i - 1]);
//            }
            }

            int[] arrayResult = new int[arrayList.size()];
            int i = 0;

            for (int x : arrayList) {
                arrayResult[i] = x;
                i++;
            }

            return arrayResult;
        }
        else return  null;
    }
}
