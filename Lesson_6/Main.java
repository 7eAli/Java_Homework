package Lesson_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        Scanner sc = new Scanner(System.in, "cp866");
        String choice = "";
        String filter_choice = "";
        while (!choice.equals("exit")) 
        {
            System.out.println("_________________________________________________");
            System.out.println("Введите 1 для добавления модели ноутбука");
            System.out.println("Введите 2 для вывода всех доступных моделей ноутбуков");
            System.out.println("Введите 3 для перехода к фильтрам вывода ноутбуков");
            System.out.println("Введите exit для выхода из программы");
            System.out.println("_________________________________________________");
            choice = sc.nextLine();            
            if (choice.equals("1"))
            {
                System.out.println("_________________________________________________");
                System.out.println("Введите бренд производителя: ");
                String manufactor = sc.nextLine();
                System.out.println("Введите объем оперативной памяти: ");
                int ram = Integer.parseInt(sc.nextLine());
                System.out.println("Введите модель процессора: ");
                String cpu = sc.nextLine();
                System.out.println("Введите объем SSD: ");
                int storage = Integer.parseInt(sc.nextLine());
                System.out.println("Введите модель видеокарты: ");
                String gpu = sc.nextLine();
                System.out.println("Введите версию операционной системы: ");
                String os = sc.nextLine();
                notebooks.add(new Notebook(manufactor, ram, cpu, storage, gpu, os));
                System.out.println("_________________________________________________");
            }
            if (choice.equals("2"))
            {
                for (Notebook notebook : notebooks) 
                {
                    System.out.println("_________________________________________________");
                    System.out.println(notebook);
                    System.out.println("_________________________________________________");                    
                }
            }
            if (choice.equals("3"))
            {
                System.out.println("_________________________________________________");
                System.out.println("Введите 1 для фильтрации по производителю");
                System.out.println("Введите 2= для фильтрации по определенному ОЗУ");
                System.out.println("Введите 2> для фильтрации по минимальному объему ОЗУ");
                System.out.println("Введите 2< для фильтрации по максимальному объему ОЗУ");
                System.out.println("Введите 3 для фильтрации по производителю процессора");
                System.out.println("Введите 4= для фильтрации по определенному объему SSD");
                System.out.println("Введите 4> для фильтрации по минимальному объему SSD");
                System.out.println("Введите 4< для фильтрации по максимальному объему SSD");
                System.out.println("Введите 5 для фильтрации по производителю видеокарты");
                System.out.println("Введите 6 для фильтрации по версии операционной системы");
                System.out.println("_________________________________________________");
                filter_choice = sc.nextLine();
                Filter_Notebooks(notebooks, filter_choice, sc);
            }
        }
        sc.close();
    }

    public static void Filter_Notebooks(List<Notebook> source, String choice, Scanner sc)
    {
        switch (choice) {
            case "1":                
                System.out.println("Введите имя производителя: ");
                String manufactor_filter = sc.nextLine();
                for (Notebook item : source) 
                {
                    if (item.getManufactor().toLowerCase().equals(manufactor_filter.toLowerCase()))
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "2=":
                System.out.println("Введите нужный объем оперативной памяти: ");
                int memory_filter1 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getRam() == memory_filter1)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "2>":
                System.out.println("Введите минимальный объем оперативной памяти: ");
                int memory_filter2 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getRam() > memory_filter2)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "2<":
                System.out.println("Введите максимальный объем оперативной памяти: ");
                int memory_filter3 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getRam() < memory_filter3)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "3":
                System.out.println("Введите производителя/модель процессора: ");
                String cpu_filter = sc.nextLine();
                for (Notebook item : source) 
                {
                    if (item.getCpu().toLowerCase().contains(cpu_filter.toLowerCase()))
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "4=":
                System.out.println("Введите нужный объем SSD: ");
                int memory_filter4 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getStorage() == memory_filter4)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "4>":
                System.out.println("Введите минимальный объем SSD");
                int memory_filter5 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getStorage() > memory_filter5)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "4<":
                System.out.println("Введите максимальный объем SSD");
                int memory_filter6 = Integer.parseInt(sc.nextLine());
                for (Notebook item : source) 
                {
                    if (item.getStorage() < memory_filter6)
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "5":
                System.out.println("Введите производителя/модель видеокарты: ");
                String gpu_filter = sc.nextLine();
                for (Notebook item : source) 
                {
                    if (item.getGpu().toLowerCase().contains(gpu_filter.toLowerCase()))
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break;
            case "6":
                System.out.println("Введите номер/версию операционной системы: ");
                String os_filter = sc.nextLine();
                for (Notebook item : source) 
                {
                    if (item.getOs().toLowerCase().contains(os_filter.toLowerCase()))
                    {
                        System.out.println("_________________________________________________");
                        System.out.println(item);
                        System.out.println("_________________________________________________");
                    }
                }
                break; 
        }
    }
}
