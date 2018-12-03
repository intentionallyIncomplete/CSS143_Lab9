import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Class Description:
 * @author Ian Bryan
 * @version December 1st, 2018.
 * 
 * Student.class holds two data items at class level scope. Attributes for this class are constructed
 * with the overloaded public constructor. When instantiated this object represents a student with a name and GPA
 * and is sorted according to the comparison magnitude between GPA's of students individually.
 */
public class Student implements Serializable,Comparable<Student> {
	
	/**
	 * Generic SerialID from IDE.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Class level data members.
	 * */
	private double GPA;
	private String name;
	
	
	/**
	 * @param n - String value represents a student's name (can be first or last).
	 * @param gpa - A double value represents a GPA for a student.
	 * 
	 * Overloaded constructor with public access. Used to take in two parameter arguments for
	 * a student's name (can be first or last) and a GPA. GPA is used for comparisons
	 * in the compareTo() method.
	 */
	public Student(String n, double gpa) {
		name = n;
		GPA = gpa;
	}
	
	@SuppressWarnings("javadoc")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		writeObjectToFile();
		Student a = readObjectFromFile();
		
		if(a != null) {
			System.out.println(a.toString());
		}
	}

	@SuppressWarnings("javadoc")
	private static Student readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student one = (Student) is.readObject();
	
		is.close();
		
		return one;
	}

	@SuppressWarnings("javadoc")
	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student student1 = new Student("student1", 3.5);
		Student student2 = new Student("student2", 3.4);
		Student student3 = new Student("student3", 2.5);
		Student student4 = new Student("student4", 1.5);
		Student student5 = new Student("student5", 0.2);
		Student student6 = new Student("student6", 3.6);
		Student student7 = new Student("student7", 2.8);
		Student student8 = new Student("student8", 2.9);
		Student student9 = new Student("student9", 4.0);
		Student student10 = new Student("student10", 3.5);
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(student1);
		os.writeObject(student2);
		os.writeObject(student3);
		os.writeObject(student4);
		os.writeObject(student5);
		os.writeObject(student6);
		os.writeObject(student7);
		os.writeObject(student8);
		os.writeObject(student9);
		os.writeObject(student10);
		os.close();		
	}

	/**
	 * @param other - A Student.
	 * 
	 * This method takes in a single object of type Student which has a GPA value assigned to it.
	 * "StudentA's" GPA is checked against "other's" GPA which produces a value between -1 and 1.
	 * */
	public int compareTo(Student other) {
		if(this.GPA < other.GPA) {
			return -1;
		}else if(this.GPA > other.GPA) {
			return 1;
		}
		return 0;
	}
}