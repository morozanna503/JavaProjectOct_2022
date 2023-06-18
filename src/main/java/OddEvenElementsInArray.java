public class OddEvenElementsInArray {
    // task 2.2
    //В классе OddEvenElementsInArray написать метод countOddEvenValuesInArray(),
    // который принимает на вход массив целых чисел и возвращает массив int[2],
    // который содержит количество четных и нечетных элементов входящего массива
    public int[] countOddEvenValuesInArray(int[] arr) {
        int odd = 0;
        int notOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                odd++;
            } else {
                notOdd++;
            }
        }
        return new int[]{odd, notOdd};
    }

    // task 2.3
    //написать метод createOddEvenArray(), который принимает массив целых случайных чисел,
    // и возвращает двумерный массив (массив четных и массив нечетных чисел)
    public int[][] createOddEvenArray(int[] array3) {
        return new int[1][1];
    }
}
