package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_14_Test {
//    Написать алгоритм NegativeOnTheRight, который принимает на
//    вход массив целых чисел, и возвращает массив, в котором
//    все негативные числа находятся во второй половине массива
//    Test Data: {4, -3, 7, -12, 5, -2, 9, 4, 12}
//    → {4, 7, 5, 9, 4, 12, -3, -12, -2}

    @Test
    public void NegativeOnTheRightHappyTest() {

        int[] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] arrayExpected = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        JB_HW_9_14 aTest = new JB_HW_9_14();
        int[] arrayActual = aTest.NegativeOnTheRight(array);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);

    }

    @Test
    public void NegativeOnTheRightHappyTestZero() {

        int[] array = {-1, 0, 1};
        int[] arrayExpected = {1, 0, -1};

        JB_HW_9_14 aTest = new JB_HW_9_14();
        int[] arrayActual = aTest.NegativeOnTheRight(array);
        System.out.println(Arrays.toString(arrayActual));

        Assertions.assertArrayEquals(arrayExpected, arrayActual);

    }
}
