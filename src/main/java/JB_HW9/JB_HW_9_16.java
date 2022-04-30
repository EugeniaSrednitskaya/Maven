package JB_HW9;

import java.util.ArrayList;
import java.util.Arrays;

public class JB_HW_9_16 {
//
//    Написать алгоритм NumberOccurrences, который принимает на
//    вход массив целых чисел, и возвращает массив пар
//    {число, сколько раз число встречается в массиве}
//    Test Data: {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1}
//    → {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}

    public int[][] NumberOccurrences(int[] array) {

        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int count = 1;
        System.out.println("1: " + Arrays.toString(array));

        if (array.length != 0) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
        }

        System.out.println("2: " + Arrays.toString(array));
        int z = 0;
        while (z < array.length) {
            for (int j = z + 1; j < array.length; j++) {
                if (array[z] == array[j]) {
                    count++;
                }
            }
            arrayList.add(new int[]{array[z], count});
            z = z + count;
            count = 1;

        }

        int[][] arrayResult = new int[arrayList.size()][2];

        for (int i = 0; i < arrayList.size(); i++) {
            arrayResult[i] = arrayList.get(i);
        }

        return arrayResult;
    }

}
