package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JB_HW_9_13_Test {

//    Написать алгоритм KthLargest, который принимает на вход
//    массив целых чисел и число k, и возвращает k-тый
//    максимальный элемент. Test Data:
//        ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
//            (12 и 12 - первый и второй самые большие элементы)

    @Test
    public void KthLargestHappyTest() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int numExpected = 9;

        JB_HW_9_13 aTest = new JB_HW_9_13();
        int numActual = aTest.KthLargest(array, k);
        System.out.println(numActual);

        Assertions.assertEquals(numExpected, numActual);
    }
}
