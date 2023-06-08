package Lesson_1;
import java.util.Scanner;

/*
 * 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = sc.nextInt();
        int triangle = sum_triangle(num);
        int factorial = factorial(num);
        System.out.println();
        System.out.println(triangle);
        System.out.println(factorial);
    }
    public static int sum_triangle(int limit)
    {
        int result = 0;
        for (int i = 1; i <= limit; i++) 
        {
            result += i;
        }
        return result;
    }
    public static int factorial(int number)
    {
        int result = 1;
        for (int i = 1; i <= number; i++) 
        {
            result *= i;            
        }
        return result;
    }
}
