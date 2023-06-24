package Lesson_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/* Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.

Пример:
Иванов 1231234
Иванов 3456345
Иванов 5676585
Петров 12345
Петров 82332 */

public class Task_1 {
    public static void main(String[] args) 
    {        
        boolean flag = true;
        Scanner sc = new Scanner(System.in, "cp866");
        HashMap<String, List<Integer>> phone_book = new HashMap<>();
        System.out.println("");
        System.out.println("Введите add_user для добавления абонента");
        System.out.println("Введите add_number для добавления номера");
        System.out.println("Введите show для вывода телефонной книги");
        System.out.println("Введите exit для выхода из программы");
        while (flag)
        {
            System.out.println("Введите команду:");            
            String choice = sc.nextLine();
            if (choice.equals("add_user"))
            {
                System.out.println("Введите имя абонента: ");
                String user = sc.nextLine();
                phone_book.putIfAbsent(user, new LinkedList<>());
            }
            if (choice.equals("add_number"))
            {
                System.out.println("Введите имя абонента: ");                
                String user = sc.nextLine();
                if (phone_book.keySet().contains(user))
                {
                    System.out.println("Введите номер телефона: ");
                    int number = Integer.parseInt(sc.nextLine());
                    phone_book.get(user).add(number);
                }
                else
                {
                    System.out.println("Такого абонента нет");
                }
            }
            if (choice.equals("show"))
            {
                for (String item : phone_book.keySet()) 
                {
                    phone_book.get(item).sort(Comparator.naturalOrder());
                    for (int i = 0; i < phone_book.get(item).size(); i++) 
                    {
                        System.out.println(item + " " + phone_book.get(item).get(i));
                    }
                }
            }
            if (choice.equals("exit"))
            {
                flag = false;
            }
        }
        System.out.println("До свидания");
        sc.close();
    }
}
