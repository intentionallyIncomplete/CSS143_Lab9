
/**
 * Class Description:
 * @author Ian Bryan
 * @version Dec 3rd, 2018.
 * 
 * Simple class that implements the Runneable interface so the use of the run() method
 * can be allowed. (Must also be tagged with @Override)
 */
public class RunnableInterface implements Runnable{

	private String someString;
	
	@Override
	public void run() {
		System.out.println(someString);
	}
	
	/**
	 * @param str - A String
	 * 
	 * Public constructor 
	 */
	public RunnableInterface(String str) {
		someString = str;
	}
	
	public static void main(String[] args) {
		Thread ri1 = new Thread(new RunnableInterface("test 1"));
		Thread ri2 = new Thread(new RunnableInterface("test 2"));
		
		ri1.start();
		ri2.start();
	}	
}
