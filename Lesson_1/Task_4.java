package Lesson_1;
import java.util.Scanner;

/*
 * 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Знаки вопроса - одинаковые цифры.
Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class Task_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение вида q + w = e, q, w, e >= 0, в q и w часть цифр замените символами ?");
        String expression = sc.nextLine();        
        expression = expression.replaceAll(" ", "");
        String[] elements = expression.split("=");
        int result = Integer.parseInt(elements[1]);
        int x_num_1 = 0;
        int x_num_2 = 0;
        int number_of_solutions = 0;
        String temp = elements[0];
        String[] unknown_numbers = temp.split("\\+");
        for (int i = 0; i < 10; i++)
        {
            x_num_1 = convert_unknown(i, unknown_numbers[0]);
            x_num_2 = convert_unknown(i, unknown_numbers[1]);
            if (x_num_1 + x_num_2 == result) 
            {
                System.out.printf("%d + %d = %d\n", x_num_1, x_num_2, result);
                number_of_solutions += 1;
            }            
        }
        if (number_of_solutions != 0)
        {
            System.out.printf("Решений %d", number_of_solutions);            
        }
        else
        {
            System.out.println("Нет решений");
        }
    }
    public static int convert_unknown(int digit, String unknown_number)
    {
        int result = 0;
        int temp = 0;
        int count = 0;
        for (int i = unknown_number.length(); i > 0; i--)
        {
            if(unknown_number.substring(count, count + 1).equals("?"))
            {
                temp = digit * power(10, i - 1);
                result = result + temp;
            }
            else
            {
                temp = Integer.parseInt(unknown_number.substring(count, count + 1)) * power(10, i - 1);
                result = result + temp;
            }
            count += 1;
        }
        return result;
    }
    public static int power(int number, int pow)
    {
        int result = 1;
        for (int i = 0; i < pow; i++) 
        {
            result = result * number;            
        }
        return result;
    }
}
