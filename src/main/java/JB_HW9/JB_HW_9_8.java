package JB_HW9;

public class JB_HW_9_8 {

    public int[] MinMaxAve(int[] array, int index1, int index2) {

//        Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//        и 2 значения индексов. Алгоритм возвращает массив, который содержит
//        минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//                Test Data:
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

        int[] arrayResult = new int[3];

        int min = Integer.MAX_VALUE;
        int max = array[0];
        int average = 0;

        if (index1 <= index2 && index1 <= array.length && index2 <= array.length && index1 >= 0 && index2 >= 0) {
            for (int i = index1; i <= index2; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }

            for (int i = index1; i <= index2; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }

            for (int i = index1; i <= index2; i++){
                average += array[i];
            }

            arrayResult[0] = min;
            arrayResult[1] = max;
            arrayResult[2] = average / (index2 - index1 + 1);
            return arrayResult;
        }

        else return arrayResult;
    }
}
