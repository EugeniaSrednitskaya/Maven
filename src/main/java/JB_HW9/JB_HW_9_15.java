package JB_HW9;

import java.util.ArrayList;

public class JB_HW_9_15 {
//    Написать алгоритм SumOfTwo, который принимает на вход
//    массив целых чисел, и число n. Алгоритм возвращает пары
//    элементов, которые в сумме дают число n.
//    Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12) → {{3, 9}, {7, 5}}

    public int[][] SumOfTwo(int[] array, int n) {

        ArrayList<int[]> arrayList = new ArrayList<int[]>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == n) {
                    arrayList.add(new int[] {array[i], array[j]});
                }
            }
        }

        int[][] arrayResult = new int[arrayList.size()][2];

        for (int i = 0; i < arrayList.size(); i++) {
            arrayResult[i] = arrayList.get(i);
        }

        return arrayResult;
    }

}
