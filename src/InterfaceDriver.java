import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;

//  InterfaceDriver
//  CSSSKL143
//  By Rob Nash
//

public class InterfaceDriver {

    //comment and uncomment the demo functions in main to test
    public static void main(String[] args) {
        //comparableDemo();
        cloneableDemo();
        //serializableDemo();
        //actionListenerDemo();
    }
    
    public static void actionListenerDemo() {
        Application a = new Application();
        
    }
    
    public static void serializableDemo() {
        writeObjectsToFile();
        readObjectsFromFile();
    }
    
    private static void readObjectsFromFile() {
        try {
            //ObjectInputStream is = new ObjectInputStream( new FileInputStream("object.dat"));
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
            
            Student a = (Student)is.readObject();  //cast is required since object is returned
            Student b = (Student)is.readObject();
            
            System.out.println("From file : " + a);
            System.out.println("From file : " + b);
            
            is.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Bad OOS");
        }
    }
    
    private static void writeObjectsToFile() {
        try {
            //ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("object.dat"));
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
            Student a = new Student("FileIO1", 3.0);
            Student b = new Student("FileIO2", 4.0);
        
            os.writeObject(a);
            os.writeObject(b);
            os.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Bad OOS");
        }
    
        
    }

    public static void comparableDemo() {
        Student a = new Student("Rob", 3.1);
        Student b = new Student("Bill", 3.2);
        Student c = new Student("Mary", 3.0);
        Student d = new Student("Bob", 2.0);
        Student e = new Student("Sue", 1.0);
        Student f = new Student("Joe", 2.5);
        Student g = new Student("Man", 3.6);
        Student h = new Student("Person", 0.0);
        Student i = new Student("Nothing", 4.0);
        Student j = new Student("Robot", 1.8);
        
        
        System.out.println( " a compareTo b :" + a.compareTo(b));
        System.out.println( " b compareTo a :" + b.compareTo(a));
        System.out.println( " b compareTo c :" + b.compareTo(c));
        System.out.println( " d compareTo c :" + d.compareTo(c));
        System.out.println( " e compareTo f :" + e.compareTo(f));
        System.out.println( " f compareTo g :" + f.compareTo(g));
        System.out.println( " g compareTo h :" + g.compareTo(h));
        System.out.println( " h compareTo j :" + h.compareTo(j));
        System.out.println( " i compareTo c :" + i.compareTo(c));
        System.out.println( " j compareTo d :" + j.compareTo(d));
    }
    
    
    public static void cloneableDemo() {
        Student a = new Student("Evan", 3.0);
        Student c = a.clone();
        
        System.out.println(a);
        System.out.println(c);
        
        System.out.println("Changing object 'a'");
        a.setName("Foo");
        a.setGPA(3.5);
        
        System.out.println(" new name: " + a.getName());
        System.out.println(" new GPA: " + a.getGPA());
        System.out.println(" The object a (name): " + a.getName());  
        System.out.println(" The object c (name): " + c.getName()); 
        System.out.println(" The object a (gpa): " + a.getGPA());  
        System.out.println(" The object c (gpa): " + c.getGPA()); 
    }
    
    
}
