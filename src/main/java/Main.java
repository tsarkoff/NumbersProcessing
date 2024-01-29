import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Отфильтруйте положительные числа.
        // Найдите среди этих положительных чисел четные.
        // Отсортируйте отфильтрованные числа в порядке возрастания.
        // Выведите результат на экран.
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> tmp = new ArrayList<>();

        for (Integer digit : intList) {
            if (digit > 0 && (digit % 2 == 0)) {
                tmp.add(digit);
            }
        }

        tmp.sort(Integer::compareTo);
        System.out.println(tmp); // [2, 4, 8, 16, 32]
    }
}
