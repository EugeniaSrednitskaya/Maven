package JB_HW9;

import java.util.ArrayList;

public class JB_HW_9_9 {

//    Написать алгоритм Intersection, который принимает на вход 2 массива
//    целых чисел и возвращает массив общих элементов.
//
//    Test Data:
//    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//    {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    public int[] Intersection(int[] array1, int[] array2) {

        int[] array3 = new int[array1.length + array2.length];

        for (int i = 0; i < array3.length; i++) {
            if (i >= 0 && i < array1.length) {
                array3[i] = array1[i];
            }
            else if (i >= array1.length) {
                array3[i] = array2[array3.length - i - 1];
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < array3.length; i++) {
            for (int j = i + 1; j < array3.length; j++) {
                if (array3[i] == array3[j]) {
                    arrayList.add(array3[i]);
                    break;
                }
            }
        }

        int i = 0;
        int[] arrayResult = new int[arrayList.size()];

        for (int x: arrayList) {
            arrayResult[i] = x;
            i++;
        }
        return arrayResult;
    }
}
