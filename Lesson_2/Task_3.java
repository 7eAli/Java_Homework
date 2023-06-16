package Lesson_2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.SortedMap;


/*
 * 3) Дана строка (сохранить в файл и читать из файла)
 *    [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 *    {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 *    {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 *    Написать метод(ы), который распарсит json и, используя StringBuilder, 
 *    создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
 *    Пример вывода:
 *    Студент Иванов получил 5 по предмету Математика.
 *    Студент Петрова получил 4 по предмету Информатика.
 *    Студент Краснов получил 5 по предмету Физика.
 */
public class Task_3 {
    public static void main(String[] args) throws IOException
    {
        StringBuilder result = new StringBuilder();
        Charset cp = Charset.forName("UTF-8");
        FileReader fr = new FileReader("Lesson_2\\source.txt", cp);
        char[] info = new char[500];
        String data = "";
        fr.read(info);
        for (char c : info) 
        {            
            data += c;
        }
        fr.close();        
        data = data.replaceAll("\\[", "");
        data = data.replaceAll(" ", "");
        data = data.replaceAll("\\]", "");
        data = data.replaceAll("\\{", "");
        data = data.replaceAll("\\}", "");
        data = data.replaceAll(",", ":");
        data = data.replaceAll("\"", "");        
        String[] elements = data.split(":");
        for (int i = 1; i < elements.length; i++) 
        {            
            if (elements[i - 1].equals("фамилия"))
            {
                result.append("Студент " + elements[i] + " получил ");
            }
            if (elements[i - 1].equals("оценка"))
            {
                result.append(elements[i] + " по предмету ");
            }
            if (elements[i - 1].equals("предмет"))
            {
                result.append(elements[i] + ".\n");
            }
        }
        System.out.println(result);           
    }
}
