package Lesson_1;

/*
 * 2) Вывести все простые числа от 1 до 1000
 */
public class Task_2 {
    public static void main(String[] args) 
    {
        get_prime();        
    }
    public static void get_prime()
    {
        int count = 0;
        for (int i = 1; i <= 1000; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    count += 1;                    
                } 
            }
            if (count == 2) 
            {
                System.out.println(i); 
            }
            count = 0;
        }
    }
}
