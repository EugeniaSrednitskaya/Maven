package JB_HW9;

public class JB_HW_9_12 {

//    Написать алгоритм SortArray, который принимает на вход
//    массив целых чисел, и сортирует элементы массива в порядке
//    возрастания. Test Data:
//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    public int[] SortArray(int[] array) {

        //int[] arrayResult = new int[array.length];

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
        return array;
    }
}