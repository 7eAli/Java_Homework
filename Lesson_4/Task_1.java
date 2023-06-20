package Lesson_4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/* Даны два Deque, представляющие два целых числа. 
Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
1) Умножьте два числа и верните произведение в виде связанного списка.
2) Сложите два числа и верните сумму в виде связанного списка.
Одно или два числа могут быть отрицательными.

Даны два Deque, цифры в обратном порядке.
[3,2,1,-] - пример Deque
[5,4,3]- пример второго Deque
1) -123 * 345 = -42 435
Ответ всегда - связный список, в обычном порядке
[-,4,2,4,3,5] - пример ответа */

public class Task_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in, "cp866");
        Deque<String> num_1 = new LinkedList<>();
        Deque<String> num_2 = new LinkedList<>();
        num_1.addFirst("-"); num_1.addFirst("1"); num_1.addFirst("2"); num_1.addFirst("3");
        num_2.addFirst("3"); num_2.addFirst("4"); num_2.addFirst("5");
        System.out.println("+/* ?");
        char choice = sc.nextLine().charAt(0);
        if (choice == '*')
        {
            int prod = get_number(num_1) * get_number(num_2);
            System.out.println(convert_to_list(prod));
        }
        else if (choice == '+')
        {
            int sum = get_number(num_1) + get_number(num_2);
            System.out.println(convert_to_list(sum));
        }
    }
    public static int get_number(Deque<String> source)
    {
        int result = 1;
        boolean negative = false;
        if (source.peekLast().equals("-")) 
        {
            negative = true;            
            source.removeLast();
        }
        int size = source.size();
        String pre_result = "";
        for (int i = 0; i < size; i++) 
        {
            pre_result += source.pollLast();
        }
        result = Integer.parseInt(pre_result);
        if (negative) return -result;        
        return result;
    }
    public static LinkedList<Character> convert_to_list(int number)
    {
        LinkedList<Character> result = new LinkedList<>();
        String pre_result = Integer.toString(number);
        for (int i = 0; i < pre_result.length(); i++) 
        {
            result.addLast(pre_result.charAt(i));            
        }
        return result;
    }
}
