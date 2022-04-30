package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_16_Test {
//
//    Написать алгоритм NumberOccurrences, который принимает на
//    вход массив целых чисел, и возвращает массив пар
//    {число, сколько раз число встречается в массиве}
//    Test Data: {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1}
//    → {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}

    @Test
    public void NumberOccurrencesHappyTest() {

        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] arrayExpected = {{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}};

        JB_HW_9_16 aTest = new JB_HW_9_16();
        int[][] arrayActual = aTest.NumberOccurrences(array);
        System.out.println(Arrays.deepToString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }
}
