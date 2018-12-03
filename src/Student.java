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
public class Student implements Serializable,Comparable<Student>,Cloneable {

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
	
	@Override
	public Student clone() {
		return new Student(this);
	}
	
	/*Goes with above method (helper constructor)*/
	/**
	 * @param newStudent - A new Student.
	 */
	public Student(Student newStudent) {
		this.setName(newStudent.getName());
		this.setGPA(newStudent.getGPA());
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

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(student1);

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
	
	/** @return - Returns name of Student.	*/
	public String getName() {	return this.name;	}
	
	/** @return - Returns GPA of Student.	*/
	public double getGPA() {	return this.GPA;	}
	
	/** @param newName - A new String for a Student's name.	*/
	public void setName(String newName) {	this.name = newName;	}
	
	/** @param newGPA - A new double value for a Student.	*/
	public void setGPA(double newGPA) {	this.GPA = newGPA;	}
}