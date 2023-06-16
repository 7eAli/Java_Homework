import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Пусть дан произвольный список целых чисел.
 * 1) Нужно удалить из него чётные числа
 * 2) Найти минимальное значение
 * 3) Найти максимальное значение
 * 4) Найти среднее значение
 */

public class Task_1 
{
    public static void main(String[] args) 
    {
        Random rd = new Random();
        List<Integer> numbers = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) 
        {
            numbers.add(rd.nextInt(100));
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) 
        {
            if (numbers.get(i) % 2 == 0)
            {
                numbers.remove(i);
                i -= 1;
            }
        }
        System.out.println(numbers);
        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        int sum = 0;
        for (Integer integer : numbers) 
        {
            sum += integer;            
        }
        Double medium = (double) sum / (double) numbers.size();
        System.out.println(max);
        System.out.println(min);
        System.out.println(medium);
    }
}
