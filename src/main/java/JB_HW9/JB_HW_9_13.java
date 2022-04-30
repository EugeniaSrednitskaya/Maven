package JB_HW9;

import java.util.Arrays;

public class JB_HW_9_13 {

//    Написать алгоритм KthLargest, который принимает на вход
//    массив целых чисел и число k, и возвращает k-тый
//    максимальный элемент. Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
//            (12 и 12 - первый и второй самые большие элементы)

    public int KthLargest(int[] array, int k) {

        int result;

        Arrays.stream(array).sorted();
        result = array[array.length - k];

        return result;
    }
}
