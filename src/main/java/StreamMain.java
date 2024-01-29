import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        // Отфильтруйте положительные числа.
        // Найдите среди этих положительных чисел четные.
        // Отсортируйте отфильтрованные числа в порядке возрастания.
        // Выведите результат на экран.
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intList.stream();
        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(text -> System.out.print(text + " ")); // 2 4 8 16 32
    }
}
