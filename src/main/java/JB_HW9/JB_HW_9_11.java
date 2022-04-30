package JB_HW9;

public class JB_HW_9_11 {

    public int[] ReverseArray(int[] array) {
//        Написать алгоритм ReverseArray, который принимает на вход
//        массив целых чисел, и возвращает “перевернутый” массив.
//                Test Data: {2, 7, 3, 10} → {10, 3, 7, 2}

        int[] arrayReverse = new int[array.length];
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                arrayReverse[array.length - i - 1] = array[i];
            }
        }
        return arrayReverse;
    }
}
