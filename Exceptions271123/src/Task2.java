/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый,
обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.

 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getArrayLenght(new int[]{1, 2, 3, 5}, 6, 5));
    }
    public static int getArrayLenght(int[] arr, int min, int element) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }

        }
        return -2;

    }
}
