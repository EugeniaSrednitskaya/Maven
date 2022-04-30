package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JB_HW_9_10_Test {

    //    Написать алгоритм PeakElement, который принимает
//    на вход массив целых чисел и возвращает значения пиковых
//    элементов (элементы, которые больше своих соседей).
//    Test Data: {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElementHappyTest() {

        int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] arrayExpected = {3, 7, 23};

        JB_HW_9_10 aTest = new JB_HW_9_10();
        int[] arrayActual = aTest.PeakElement(array);
        //System.out.println(Arrays.toString(arrayActual));
        Assertions.assertArrayEquals(arrayExpected, arrayActual);

    }

    @Test
    public void testPeakElementHappyTestNull() {

        int[] array = {1, 1, 1};
        //int[] arrayExpected = {3, 7, 23};

        JB_HW_9_10 aTest = new JB_HW_9_10();
        int[] arrayActual = aTest.PeakElement(array);
        //System.out.println(Arrays.toString(arrayActual));
        Assertions.assertNull(arrayActual);
    }

}
