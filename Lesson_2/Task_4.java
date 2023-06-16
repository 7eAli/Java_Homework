package Lesson_2;

import java.util.Scanner;

/*
 * 4) К калькулятору из предыдущего ДЗ добавить логирование.
 */
public class Task_4 
{
    public static void main(String[] args) 
    {
        double a = input_number();
        String action = input_action();
        double b = input_number();
        double result = 0;
        if (action.equals("+")) {
            result = a + b;
        } else if (action.equals("-")) {
            result = a - b;
        } else if (action.equals("*")) {
            result = a * b;
        } else if (action.equals("/")) {
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
