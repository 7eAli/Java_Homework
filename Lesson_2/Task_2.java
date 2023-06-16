package Lesson_2;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива, 
 *    результат после каждой итерации запишите в лог-файл.
 */
public class Task_2 
{
    public static void main(String[] args) throws IOException
    {
        Logger ll = Logger.getLogger(Task_2.class.getName());
        FileHandler fh = new FileHandler("Lesson_2\\log_task_2.txt", true);            
        SimpleFormatter formatter = new SimpleFormatter();
        ll.addHandler(fh);
        fh.setFormatter(formatter);
        Random rd = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) 
        {
            numbers[i] = rd.nextInt(10);
        }        
        Bubble_Sort(numbers, ll);        
    }
    public static String Print_Array(int[] arr)
    {
        String result = "[";        
        for (int i = 0; i < arr.length; i++) 
        {            
            result += Integer.toString(arr[i]);
            if (i != arr.length - 1)
            {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
    public static void Bubble_Sort(int[] arr, Logger ll)
    {                 
        int temp;
        ll.log(Level.WARNING, "Logger on");     
        for (int i = 1; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length - i; j++) 
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                ll.log(Level.INFO,Print_Array(arr));          
            }            
        }
        ll.log(Level.WARNING, "Logger off");         
    }        
}

