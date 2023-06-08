package Lesson_1;
import java.util.Scanner;

/*
 * 3) Реализовать простой калькулятор
+ - / *

Введите первое число: A \n
Введите знак: *
Введите второе число: B
Результат: A*B

sc.next() -- считывает символ
sc.nextLine() -- считывает всю строчку
sc.nextInt() -- считывает число, но без перехода на след. строчку
 */
public class Task_3 {
    public static void main(String[] args) 
    {
        double a = input_number();
        String action = input_action();
        double b = input_number();
        double result = 0;
        if (action.equals("+")) 
        {
            result = a + b;
        }         
        else if (action.equals("-"))
        {
            result = a - b;            
        }
        else if (action.equals("*"))
        {
            result = a * b;
        }
        else if (action.equals("/"))
        {
            result = a / b;
        }
        System.out.printf("%f %s %f = %f", a, action, b, result);
    }    
    public static String input_action()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите действие: ");
        String result = sc.nextLine();
        return result;
    }
    public static double input_number()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        double result = sc.nextDouble();
        return result;
    }
}
