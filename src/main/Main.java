/**
 * Предположим, что мы хотим найти элемент в массиве (получить его индекс).
 * Мы можем это сделать просто перебрав все элементы. Но что, если массив уже отсортирован?
 * В этом случае можно использовать бинарный поиск. Принцип прост: сначала берём элемент находящийся посередине
 * и сравниваем с тем, который мы хотим найти. Если центральный элемент больше нашего,
 * рассматриваем массив слева от центрального, а если больше - справа и повторяем так до тех пор,
 * пока не найдем наш элемент.
 *
 * Написать программу на любом языке в любой парадигме для бинарного поиска.
 * На вход подаётся целочисленный массив и число.
 * На выходе - индекс элемента или -1, в случае если искомого элемента нет в массиве.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);
        System.out.println();
        System.out.println(getIndex(array, 5));
    }
    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    private static int getIndex(int[] array, int findNumber) {
        int result = -1;
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high - low) / 2;
            if (array[middle] < findNumber) {
                low = middle + 1;
            } else if (array[middle] > findNumber) {
                high = middle - 1;
            } else if (array[middle] == findNumber) {
                result = middle;
                break;
            }
        }
        return result;
    }
}