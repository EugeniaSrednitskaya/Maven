package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

//        Написать алгоритм MinMaxAve, который принимает массив чисел int[]
//        и 2 значения индексов. Алгоритм возвращает массив, который содержит
//        минимальное значение, максимальное значение,  и среднее среди всех значений между 2-мя индексами.
//
//                Test Data:
//        ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

public class JB_HW_9_8_Test {
    @Test
    public void testMinMaxAveHappyTest() {
        //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;

        int[] arrayExpected = {3, 7, 5};

        JB_HW_9_8 as = new JB_HW_9_8();
        int[] arrayActual = as.MinMaxAve(array, index1, index2);
        //System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);

    }

    @Test
    public void testMinMaxAveHappyTestNullArray() {
        int index1 = -2;
        int index2 = 6;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        int[] arrayExpected = new int[3];//{3, 7, 5};
        //System.out.println(Arrays.toString(arrayExpected));

        JB_HW_9_8 as = new JB_HW_9_8();
        int[] arrayActual = as.MinMaxAve(array, index1, index2);
        //System.out.println(Arrays.toString(arrayActual));

        Assertions.assertNull(arrayActual);

    }

    @Test
    public void testMinMaxAveHappyTestNegativeIndex() {
        int index1 = -2;
        int index2 = 6;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        int[] arrayExpected = new int[3];//{3, 7, 5};
        System.out.println(Arrays.toString(arrayExpected));

        JB_HW_9_8 as = new JB_HW_9_8();
        int[] arrayActual = as.MinMaxAve(array, index1, index2);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);

    }

}
