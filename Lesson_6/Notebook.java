package Lesson_6;

public class Notebook {
    private String manufactor;
    private int ram;
    private String cpu;
    private int storage;
    private String gpu;
    private String os;
    public Notebook(String manufactor, int ram, String cpu, int storage, String gpu, String os) 
    {
        this.manufactor = manufactor;        
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
        this.gpu = gpu; 
        this.os = os;        
    }

    public String getManufactor()
    {
        return this.manufactor;
    }
    public int getRam()
    {
        return this.ram;
    }
    public String getCpu()
    {
        return this.cpu;
    }
    public int getStorage()
    {
        return this.storage;
    }
    public String getGpu()
    {
        return this.gpu;
    }
    public String getOs()
    {
        return this.os;
    }

   
    @Override
    public String toString()
    {
        return "Производитель: " + this.manufactor + 
               "\nОперативная память: " +  this.ram + 
               " ГБ \nПроцессор: " + this.cpu + 
               "\nОбщий объем памяти SSD: " + this.storage + 
               " ГБ\nВидеокарта: " + this.gpu +
               "\nВерсия ОС: " + this.os;
    }
}
