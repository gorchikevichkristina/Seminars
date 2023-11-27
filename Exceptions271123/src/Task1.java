public class Task1 {
    public static void main(String[] args) {
        System.out.println(getArrayLenght(new int[]{1, 2, 3, 5}, 6));
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов целочисленный массив и некоторый допустимый минимум.
    Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

     */
    public static int getArrayLenght(int[] arr, int min) {
        if (arr.length < min) {
            return -1;
        }
        return arr.length;

    }

}
