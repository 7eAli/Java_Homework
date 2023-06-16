package Lesson_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * 4) К калькулятору из предыдущего ДЗ добавить логирование.
 */
public class Task_4 
{
    public static void main(String[] args) throws IOException
    {
        Logger ll = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("Lesson_2\\log_task_4.txt", true);            
        SimpleFormatter formatter = new SimpleFormatter();
        ll.addHandler(fh);
        fh.setFormatter(formatter);
        double a = input_number();
        String action = input_action();
        double b = input_number();
        double result = 0;
        if (action.equals("+")) result = a + b;
        else if (action.equals("-")) result = a - b;
        else if (action.equals("*")) result = a * b;
        else if (action.equals("/")) result = a / b;
        System.out.printf("%f %s %f = %f", a, action, b, result);
        ll.log(Level.WARNING, "Logger on");     
        ll.log(Level.INFO, Double.toString(a) + " " + action + " " + Double.toString(b) + " = " + result);
        ll.log(Level.WARNING, "Logger off");     
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
