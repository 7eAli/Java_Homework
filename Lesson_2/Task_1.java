package Lesson_2;

/*
 * 1) Дана строка sql-запроса "select * from students WHERE ". 
 *    Сформируйте часть WHERE этого запроса, используя StringBuilder. 
 *    Данные для фильтрации приведены ниже в виде json-строки.
 *    Если значение null, то параметр не должен попадать в запрос.
 *    String input_str = "{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}"
 *    Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 *    вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
 */
public class Task_1 {
    public static void main(String[] args) {
        StringBuilder request = new StringBuilder("select * from students WHERE");
        String input_str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        input_str = input_str.replaceAll("'", "");
        input_str = input_str.replaceAll("\\{", "");
        input_str = input_str.replaceAll("\\}", "");
        String[] elements = input_str.split(", ");
        for (int i = 0; i < elements.length; i++) {
            if (!elements[i].split(":")[1].equals("null")) {
                request.append(" " + elements[i].split(":")[0] + "=" + elements[i].split(":")[1]);
            }
            if (i != elements.length - 1) 
            {
                if (!elements[i + 1].split(":")[1].equals("null")) 
                {
                    request.append(" " + "AND");
                }
            }
            System.out.println(request);
        }
        System.out.println(request);
    }
}
