package Employee;
public class Main {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.setName("Orang 1");
        a.setNip(13);
        a.hitung(10,"menikah");
        a.hitung();
        a.display();
        
    Boss b = new Boss();
    b.setName("orang 2");
    b.setNip(10);
    b.hitung(15,"Menikah");
    b.hitung();
    b.display();
    
    Manager m = new Manager ();
    m.setName("orang 3");
    m.setNip(25);
    m.hitung(19,"bujang");
    m.hitung();
    m.display();
    
    CleaningService c = new CleaningService ();
    c.setName("orang 4");
    c.setNip(10);
    c.hitung(5, "Jomblo");
    c.hitung();
    c.display();
    }
    }
    

