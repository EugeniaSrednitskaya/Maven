package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_12_Test {

    //    Написать алгоритм SortArray, который принимает на вход
//    массив целых чисел, и сортирует элементы массива в порядке
//    возрастания. Test Data:
//    {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    @Test
    public void SortArrayHappyTest() {

//        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
//        int[] arrayExpected = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        int[] array = {1, -1, 0};
        int[] arrayExpected = {-1, 0, 1};

        JB_HW_9_12 aTest = new JB_HW_9_12();
        int[] arrayActual = aTest.SortArray(array);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }
}
