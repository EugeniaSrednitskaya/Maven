package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_11_Test {
//        Написать алгоритм ReverseArray, который принимает на вход
//        массив целых чисел, и возвращает “перевернутый” массив.
//                Test Data: {2, 7, 3, 10} → {10, 3, 7, 2}

    @Test
    public void ReverseArrayHappyTest() {
        int[] array = {2, 7, 3, 10};
        int[] arrayExpected = {10, 3, 7, 2};

        JB_HW_9_11 aTest = new JB_HW_9_11();
        int[] arrayActual = aTest.ReverseArray(array);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);
    }

    @Test
    public void ReverseArrayHappyTestNull() {
        int[] array = {};
        int[] arrayExpected = {};

        JB_HW_9_11 aTest = new JB_HW_9_11();
        int[] arrayActual = aTest.ReverseArray(array);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertNull(arrayActual);
    }
}
