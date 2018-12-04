import java.util.ArrayList;
/**
 * Class Description:
 * @author Ian Bryan
 * @version December 3rd, 2018.
 * 
 * 
 */
public class QuizTracker implements Cloneable{

	/**	Class level data members	*/
	private ArrayList<QuizScore> listOfScores = new ArrayList<QuizScore>();
	private ArrayList<QuizScore> copyOfScores = new ArrayList<QuizScore>();
	
	/**
	 * @param newQT - An object of type QuizTracker.
	 * 
	 * A basic copy constructor used as a helper method 
	 * for the overridden clone() method.
	 */
	public QuizTracker(QuizTracker newQT) {
		for (QuizScore qs : listOfScores) {
			copyOfScores.add(qs.clone());
		}
	}
	
	@Override
	public QuizTracker clone() {
		return new QuizTracker(this);
	}
	
	/**
	 * @param newScore - A new QuizScore object that has some value.
	 */
	public void add(QuizScore newScore) {
		listOfScores.add(newScore.clone());
	}
}
