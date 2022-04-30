package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_15_Test {
    //    Написать алгоритм SumOfTwo, который принимает на вход
//    массив целых чисел, и число n. Алгоритм возвращает пары
//    элементов, которые в сумме дают число n.
//    Test Data: ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12) → {{3, 9}, {7, 5}}

    @Test
    public void SumOfTwoHappyTest() {

        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int n = 12;
        int[][] arrayExpected = {{3, 9}, {7, 5}};

        JB_HW_9_15 aTest = new JB_HW_9_15();
        int[][] arrayActual = aTest.SumOfTwo(array, n);
        System.out.println(Arrays.deepToString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }
}
