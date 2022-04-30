package JB_HW9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JB_HW_9_9_Test {

    @Test
    public void testIntersectionHappyTest(){
//        int[] array1 = {1, 2, 4, 5, 89};
//        int[] array2 = {8, 9, 4, 2};
//        int[] arrayExpected = {2, 4};

//        int[] array1 = {1, 2, 4, 5, 8, 9};
//        int[] array2 = {8, 9, -4, -2};
//        int[] arrayExpected = {8, 9};
//
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] arrayExpected = {};
        System.out.println(Arrays.toString(arrayExpected));

        JB_HW_9_9 aTest = new JB_HW_9_9();
        int[] arrayActual = aTest.Intersection(array1, array2);
        //System.out.println(Arrays.toString(arrayActual));
        //Assertions.assertArrayEquals(arrayExpected, arrayActual);
        Assertions.assertNull(arrayActual);
    }
}
